
package libreria;

//Clase Libro
public class Libro {
    
    //Declaracion de atributos de la clase Libro
    String nombre, autor, idioma;
    int paginas;
    
    //Constructor sin argumentos
    //Inicializa cada atributo en vacio y el atributo de paginas en 0
    public Libro(){
        nombre="";
        autor="";
        idioma="";
        paginas=0;
    }

    //Constructor con argumentos
    //Inicializa cada atributo con respecto a los argumentos de entrada
    public Libro(String nombre, String autor, String idioma, int paginas) {
        this.nombre = nombre;
        this.autor = autor;
        this.idioma = idioma;
        this.paginas = paginas;
    }

    //Getters, metodos para obtener los atributos
    public String getNombre() {
        return nombre;
    }

    public String getAutor() {
        return autor;
    }

     public String getIdioma() {
        return idioma;
    }
    
    public int getPaginas() {
        return paginas;
    }
    
    //Setters, metodos para configurar-modificar los atributos
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

   
    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    //Metodo toString, para convertir la clase en un String
    //Este metodo tiene como fin obtener una descripcion de la clase 
    //La etiqueta @Override implica que la implementacion de este metodo sobrescribira el metodo toString del padre 
    //(el metodo toString lo tienen todas las clases en JAVA, se lo sobrescribe con el fin de adaptar el metodo a nuestras necesidades)
    @Override
    public String toString() {
        //Declaramos la variable descripcion de tipo String
        String descripcion;
        //Concatenamos la informacion de los atributos
        descripcion="Nombre: "+nombre+"\n";
        descripcion+="Autor: "+autor+"\n";
        descripcion+="Idioma: "+idioma+"\n";
        descripcion+="Paginas: "+paginas+"\n";
        //Retornamos la descripcion
        return descripcion;
    }

    

  
    
    
    
    
    
}
