

package com.mycompany.arrayexample;


public class ArrayExample {

     private String[] items = {"Apple", "Banana", "Cherry", "Date", "Elderberry"};

    public String[] getItems() {
        return items;
    }

    public boolean hasFiveElements() {
        return items.length == 5;
    }

    public int search(String target) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null && items[i].equalsIgnoreCase(target)) {
                return i; 
            }
        }
        return -1; 
    }

    public void delete(String target) {
        int index = search(target);
        if (index != -1) {
            
            for (int i = index; i < items.length - 1; i++) {
                items[i] = items[i + 1];
            }
            items[items.length - 1] = null; 
        }
    }
    
     public static void main(String[] args) {
        ArrayExample service = new ArrayExample();

        System.out.println("Initial array:");
        for (String item : service.getItems()) {
            System.out.println(item);
        }

        System.out.println("\nCheck if array has five elements:");
        System.out.println(service.hasFiveElements());

        System.out.println("\nSearch for 'Cherry':");
        int index = service.search("Cherry");
        System.out.println("Found at index: " + index);

        System.out.println("\nDelete 'Banana' and display array:");
        service.delete("Banana");
        for (String item : service.getItems()) {
            System.out.println(item);
        }
    }
}
