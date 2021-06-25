import java.util.*;

public class Main {

    private static double allSquare = 0;
    private static double floor1Square = 0;
    private static double floor2Square = 0;
    private static double floor3Square = 0;
    private static double floor4Square = 0;

    private static Map<String, Double> squareTypeRoom = new HashMap<>();


    public static void main(String[] args) {


        Room[] firstFloor = generateArray();
        ArrayList<Room> secondFloor = generateArrayList();
        LinkedList<Room> thirdFloor = generateLinkedList();
        Vector<Room> fourthFloor = generateVector();



        ArrayConteiner arrayConteiner = new ArrayConteiner();
        arrayConteiner.setRooms(firstFloor);
        Iterator<Room> iterator1 = arrayConteiner.getIterator();

        Room temp;
        floor1Square = iter(iterator1);

        Iterator<Room> iterator2 = secondFloor.iterator();
        floor2Square = iter(iterator2);

        Iterator<Room> iterator3 = thirdFloor.iterator();
        floor3Square = iter(iterator3);

        Iterator<Room> iterator4 = fourthFloor.iterator();
        floor4Square = iter(iterator4);

        System.out.println("allSquare = " + allSquare + "\n" +
                "floor1Square = " + floor1Square + "\n" +
                "floor2Square = " + floor2Square + "\n" +
                "floor3Square = " + floor3Square + "\n" +
                "floor4Square = " + floor4Square + "\n");

        for (Map.Entry<String, Double> entry : squareTypeRoom.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue().toString());
        }
    }

    private static double iter(Iterator<Room> it) {
        Room temp;
        double floor = 0;
        while (it.hasNext()) {
            temp = it.next();
            allSquare += temp.getSquare();
            floor += temp.getSquare();
            if (squareTypeRoom.containsKey(temp.getType())) {
                squareTypeRoom.put(temp.getType(), squareTypeRoom.get(temp.getType()) + temp.getSquare());
            } else {
                squareTypeRoom.put(temp.getType(), temp.getSquare());
            }
        }
        return floor;
    }

    private static Room[] generateArray() {
        //1����
        Room room1 = new Room("������", 14);
        Room room2 = new Room("�����", 20);
        Room room3 = new Room("���", 40);
        Room room4 = new Room("�������", 18);
        Room room5 = new Room("��������", 30);
        Room[] firstFloor = {room1, room2, room3, room4, room5};
        return firstFloor;
    }

    private static ArrayList<Room> generateArrayList() {
        //2����
        Room room6 = new Room("������", 10);
        Room room7 = new Room("�������", 20);
        Room room8 = new Room("�������", 20);
        Room room9 = new Room("�����������", 15);
        Room room10 = new Room("�������", 30);
        ArrayList<Room> secondFloor = new ArrayList<>();
        secondFloor.add(room6);
        secondFloor.add(room7);
        secondFloor.add(room8);
        secondFloor.add(room9);
        secondFloor.add(room10);
        return secondFloor;
    }

    private static LinkedList<Room> generateLinkedList() {
        //3����
        Room room11 = new Room("������", 20);
        Room room12 = new Room("���", 40);
        LinkedList<Room> thirdFloor = new LinkedList<>();
        thirdFloor.add(room11);
        thirdFloor.add(room12);
        return thirdFloor;
    }

    private static Vector<Room> generateVector() {
        //4����
        Room room13 = new Room("������", 40);

        Vector<Room> fourthFloor = new Vector<>();
        fourthFloor.add(room13);
        return fourthFloor;
    }
}



interface Container {
    ArrayConteiner.MyIterator getIterator();
}

class ArrayConteiner implements Container {

    Room[] rooms;

    @Override
    public MyIterator getIterator() {
        return new MyIterator();
    }

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }

    class MyIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() {
            return index < rooms.length;
        }

        @Override
        public Object next() {
            if (hasNext()) {
                return rooms[index++];
            }
            return null;
        }
    }
}


