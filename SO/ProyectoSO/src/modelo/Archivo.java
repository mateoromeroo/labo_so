package modelo;

import explorador.Explorador;
import explorador.InterfazExplorador;
import modelo.XMLManager;
import javax.swing.JLabel;
import javax.swing.JPanel;
import org.w3c.dom.Attr;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

/**
 *
 * @author Sistemas Operativos
 */
public class Archivo extends Elemento{
    
    private String contenido, dueño, texto;
    private boolean lectura, edicion;
    
    public Archivo(int id, String nombre, String tipo, String contenido, boolean lectura, boolean edicion, String dueño, String texto) {
        super(id, nombre, tipo, "NO");
        this.contenido = contenido;
        this.lectura = lectura;
        this.edicion = edicion;
        this.dueño = dueño;
        this.texto = texto;
    }
    
    public String getContenido() {
        return contenido;
    }
    
    @Override
    public void agregar(){
        Element archivo = Explorador.arbol.createElement("archivo");
        Explorador.currentDir.appendChild(archivo);

        Attr attr = Explorador.arbol.createAttribute("id");
        attr.setValue(String.valueOf(Explorador.getCurrentId()));
        Explorador.setCurrentId(Explorador.getCurrentId() + 1);  
        
        archivo.setAttributeNode(attr);     

        Attr attNombre = Explorador.arbol.createAttribute("nombre");
        attNombre.setValue(this.getNombre());
        archivo.setAttributeNode(attNombre);
        
        Attr attDueño = Explorador.arbol.createAttribute("dueño");
        attDueño.setValue(this.getDueño());
        archivo.setAttributeNode(attDueño);
        
        Attr attLectura = Explorador.arbol.createAttribute("lectura");
        attLectura.setValue(lectura ? "Público" : "Privado");
        archivo.setAttributeNode(attLectura); 
        
        Attr attEscritura = Explorador.arbol.createAttribute("escritura");
        attEscritura.setValue(edicion ? "Público" : "Privado");
        archivo.setAttributeNode(attEscritura); 

        Attr attContenido = Explorador.arbol.createAttribute("contenido");
        attContenido.setValue(this.getContenido());
        archivo.setAttributeNode(attContenido);
        
        Attr attTexto = Explorador.arbol.createAttribute("texto");
        attTexto.setValue(this.getTexto());
        archivo.setAttributeNode(attTexto);
        
        Attr attEliminado = Explorador.arbol.createAttribute("Eliminado");
        attEliminado.setValue(this.getEliminado());
        archivo.setAttributeNode(attEliminado);

        XMLManager xml = new XMLManager();
        xml.guardar();       
    }
    
    public void editar(JPanel ultimoClickeado){                 
        JLabel nombreElemento = (JLabel) ultimoClickeado.getComponent(2);
        Element elemento = (Element) obtenerNodoHijo(nombreElemento.getText()).cloneNode(true);
        Elemento viejo = new Elemento(Integer.parseInt(elemento.getAttribute("id")), elemento.getAttribute("nombre"), "Directorio", "NO");
        viejo.eliminar();
        
        elemento.setAttribute("id", String.valueOf(this.getId()));
        elemento.setAttribute("nombre", this.getNombre());
        elemento.setAttribute("dueño", this.getDueño());
        elemento.setAttribute("Eliminado", this.getEliminado());
        elemento.setAttribute("lectura", lectura ? "Público" : "Privado");
        elemento.setAttribute("escritura", edicion ? "Público" : "Privado");       
        elemento.setAttribute("texto", this.getTexto());
        
        Explorador.currentDir.appendChild(elemento);
        XMLManager xml = new XMLManager();
        xml.guardar();
    }
    
    public static Element obtenerNodoHijo(String nombre){
        NodeList hijos = Explorador.currentDir.getChildNodes();
        for(int i = 0; i < hijos.getLength(); i++){
            if(hijos.item(i).getNodeName().equals("archivo") && hijos.item(i).getAttributes().getNamedItem("nombre").getTextContent().equals(nombre))               
                return (Element) hijos.item(i);
        }
        return null;
    }
    
    public void clonar(){
        Explorador.currentDir.appendChild(Explorador.elementoaPegar.cloneNode(true));
        XMLManager xml = new XMLManager();
        xml.guardar();  
    }
    
    public boolean isLectura() {
        return lectura;
    }

    public boolean isEdicion() {
        return edicion;
    }

    public String getDueño() {
        return dueño;
    }
    
    public String getTexto(){
        return texto;
    }
}