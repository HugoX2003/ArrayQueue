package arrayqueue;

public class ArrayQueueDemo {
    public static void main(String[] args) {
        
        ArrayQueue<String> AQ = new ArrayQueue();
        
        AQ.enqueue("Maria");
        AQ.enqueue("Gladys");
        AQ.enqueue("Serena");
        AQ.enqueue("Emilia");
        AQ.enqueue("Marianella");
        
        
        System.out.println("El nombre en FRENTE de la pila es: "+AQ.first());
        
        System.out.println("Numero de nombres que han sido agregados(enqueue) a la cola es: "
                +AQ.size()+"\n");
        
        //---------------------------------------
        System.out.println("Contenido de la COLA AQ via toString: \n"
                +AQ.toString()+"\n");
        
        System.out.println("Contenidos individualmente extraido (dequeue): ");
        while(!AQ.isEmpty()){
            System.out.print(AQ.dequeue());
            System.out.print(" ");
        }
        //---------------------------------------
        if(AQ.isEmpty()){
            System.out.println("\nAhora la Cola ahora está Vacia");
        }else{
            System.out.println("\nQuedan elementos en la cola");
        }
        
    }
}
