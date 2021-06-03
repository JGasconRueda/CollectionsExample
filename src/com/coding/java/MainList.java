package com.coding.java;

import java.util.*;
import java.util.stream.Stream;

public class MainList {
    public static void main(String[] args) {
        // LIST
        // Implementaciones de List
        ArrayList arrayList = new ArrayList();
        LinkedList<Integer> linkedList = new LinkedList();
        Vector vector = new Vector();
        Stack stack = new Stack();

        // Generic list
        List<String> listaString = new ArrayList<String>();

        // Insert elements
        listaString.add("pedro");
        listaString.add("juan");
        listaString.add("ana");
        listaString.add(0,"pepe"); // Insert en un indice especifico
        List<String> listaDestino = new ArrayList<>();
        listaDestino.addAll(listaString);
        linkedList.addFirst(2);
        linkedList.addLast(5);


        // Get elements
        String element0 = listaString.get(0);
        String element1 = listaString.get(1);
        String element2 = listaString.get(2);
        int firstElement = linkedList.getFirst();// constant-time operation
        int lastElement = linkedList.getLast(); // constant-time operations.

        // Set elements
        listaString.set(0,"David");

        // Find Elements
        int index1 = listaString.indexOf(element1);
        int index2 = listaString.indexOf(element2);
        int lastIndex = listaString.lastIndexOf(element1);

        // Contains
        boolean contains = listaString.contains("juan");
        listaString.add(null);
        boolean containsNull = listaString.contains(null);

        // Remove
        listaString.remove(element0);
        listaString.remove(0);
        listaString.clear();//Elimina todos los elementos
        int firstElementRemove = linkedList.removeFirst();
        int lastElementRemove = linkedList.removeLast();
        boolean removed = linkedList.removeFirstOccurrence(1);

        // RetainAll
        listaString.retainAll(listaDestino);

        // Size
        int size = listaString.size();

        // Sublist of List
        List<String> sublist = listaString.subList(1, 3);

        // Convert List to Set
        Set<String> set = new HashSet<>();
        set.addAll(listaString);

        // Convert List to Array (with cast)
        String[] arrayString = (String[])listaString.toArray();

        // Convert Array to List (with cast)
        String[] values = new String[]{ "one", "two", "three" };
        List<String> list = (List<String>) Arrays.asList(values);

        // Método factoria (Java 9)
        List<Integer> miListaInt = List.of(3, 1, 4);

        // El método of construye colecciones inmutables.
        // Para permitir modificar y añadir elementos, tendríamos que recurrir al
        // constructor de la colección que deseemos
        List<Integer> miListaIntMod = new ArrayList<Integer>(List.of(3, 1, 4));

        //Sort List
        Collections.sort(list);

        // Sort List Using Comparator
        Persona p1 = new Persona("Pepe", "Perez", "Ramirez", 20);
        Persona p2 = new Persona("Juan", "Dominguez", "Gutierrez", 15);
        Persona p3 = new Persona("Antonio", "Bermudez", "Sanchez", 36);
        Persona p4 = new Persona("Jose", "Santos", "Calle", 26);
        Persona p5 = new Persona("Juan", "Dominguez", "Gutierrez", 15);
        Persona p6 = new Persona("Juan", "Dominguez", "Gutierrez", 18);

        List<Persona> listaPersonas = new ArrayList<Persona>();
        listaPersonas.add(p1);
        listaPersonas.add(p2);
        listaPersonas.add(p3);
        listaPersonas.add(p4);
        listaPersonas.add(p5);

        Collections.sort(listaPersonas, new Comparator<Persona>() {
            @Override
            public int compare(Persona p1, Persona p2) {
                if(p1.getNombre().compareTo(p2.getNombre()) == 0){
                    if(p1.getApellido1().compareTo(p2.getApellido1()) == 0){
                        if(p1.getApellido2().compareTo(p2.getApellido2()) == 0){
                            return Integer.compare(p1.getEdad(),p2.getEdad());
                        }
                        else {
                            return p1.getApellido2().compareTo(p2.getApellido2());
                        }
                    }
                    else{
                        return p1.getApellido1().compareTo(p2.getApellido1());
                    }
                }
                else{
                    return p1.getNombre().compareTo(p2.getNombre());
                }
            }
        });

        // Iterate List
        // Iterate List Using Iterator
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()) {
            String next = iterator.next();
        }

        // Iterate List Using For-Each Loop
        for(String element : list) {
            System.out.println(element);
        }

        list.forEach(System.out::println);

        //Iterate List Using For Loop
        for(int i=0; i < list.size(); i++) {
            String element = list.get(i);
        }

        // Iterate List Using Java Stream API
        Stream<String> stream = list.stream();

    }
}
