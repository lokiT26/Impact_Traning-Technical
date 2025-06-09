public class LinkedList_ex {
    
    Box firstBox;
    
    void insert(int value){
        Box boxToAdd = new Box(value);
        if(firstBox == null){
            firstBox = boxToAdd;
            return;
        }

        Box tempBox = firstBox;
        while(tempBox.address != null){
            tempBox = tempBox.address;
        }
        tempBox.address = boxToAdd;
    }

    void insertAtFirst(int value){
        Box boxToAdd = new Box(value);
        boxToAdd.address = firstBox;
        firstBox = boxToAdd;
    }

    void insertAtIndex(int index, int value){
        if(index < 0){
            System.out.println("Index should be >= 0");
            return;
        }

        if(index == 0){
            insertAtFirst(value);
            return;
        }

        Box boxToAdd = new Box(value);
        Box tempBox = firstBox;
        for(int i = 0; i < index - 1; i++){
            if(tempBox == null){
                System.out.println("Index out of Bound");
                return;
            }
            tempBox = tempBox.address;
        }

        if(tempBox == null){
            System.out.println("Index out of Bound");
            return;
        }

        boxToAdd.address = tempBox.address;
        tempBox.address = boxToAdd;
        
    }

    void deleteByValue(int value){
        if(firstBox == null) return;

        if(firstBox.value == value){
            firstBox = firstBox.address;
            return;
        }
        Box tempBox = firstBox;
        while(tempBox.address != null && tempBox.address.value != value){
            tempBox = tempBox.address;
        }

        if(tempBox.address == null){
            System.out.println("Value not present");
            return;
        }

        if(tempBox.address.value == value){
            tempBox.address = tempBox.address.address;
        }
    }

    void display(){
        Box tempBox = firstBox;
        while(tempBox != null){
            System.out.print(tempBox.value+ " -> ");
            tempBox = tempBox.address;
        }
        System.out.println("null");
    }

    void displayReverse(){
        displayReverseUtil(firstBox);
        System.out.println("null");
    }
    private void displayReverseUtil(Box current){
        if(current == null){
            return;
        }
        displayReverseUtil(current.address);
        System.out.print(current.value + " -> ");
    }

    public static void main(String[] args) {
        LinkedList_ex LL = new LinkedList_ex();
        LL.insert(100);
        LL.insert(200);
        LL.insert(300);
        LL.display();
        LL.insertAtFirst(50);
        LL.display();
        LL.insertAtIndex(3, 250);
        LL.display();
        LL.displayReverse();
        LL.deleteByValue(300);
        LL.display();
    }
    
    class Box{
        int value;
        Box address;
    
        Box(int value){
            this.value = value;
            // this.address = null; // Default value is null already
        }
    }
}

