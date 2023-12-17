
public class Main {
    public static void main(String[] args) {
        // 5 cuốn sách thuộc lớp programming
        ProgrammingBook programmingBook[] = new ProgrammingBook[5];
        programmingBook[0] = new ProgrammingBook(1, "C", 50, "noname", "C++", "no");
        programmingBook[1] = new ProgrammingBook(2, "Java1", 70, "noname", "Java", "no");
        programmingBook[2] = new ProgrammingBook(3, "C", 90, "noname", "C#", "no");
        programmingBook[3] = new ProgrammingBook(4, "Java2", 110, "noname", "Javascript", "no");
        programmingBook[4] = new ProgrammingBook(5, "C", 130, "noname", "C", "no");
        //5 cuốn sách thuộc lớp fiction
        FictionBook fictionBook[] = new FictionBook[5];
        fictionBook[0] = new FictionBook(1, "fiction1", 50, "noname", "Viễn Tưởng 1");
        fictionBook[1] = new FictionBook(2, "fiction1", 60, "noname", "Viễn Tưởng 2");
        fictionBook[2] = new FictionBook(3, "fiction1", 70, "noname", "Viễn Tưởng 3");
        fictionBook[3] = new FictionBook(4, "fiction1", 80, "noname", "Viễn Tưởng 6");
        fictionBook[4] = new FictionBook(5, "fiction1", 100, "noname", "Viễn Tưởng 1");

        //Tổng tiền 10 cuốn sách
        double totalPriceProgram = 0;
        double totalPriceFiction = 0;
        int countProgram = 0;
        int countFiction = 0;
        int countPriceFiction = 0;

        for (int i = 0; i < programmingBook.length; i++) {
            totalPriceProgram += programmingBook[i].getPrice();
        }
        for (int i = 0; i < fictionBook.length; i++) {
            totalPriceFiction += fictionBook[i].getPrice();
        }
        System.out.println("Tổng tiền 10 cuốn  sách là :\n" + (totalPriceProgram + totalPriceFiction));

        //Đếm số sách ProgrammingBook có language là "Java"
        for (int i = 0; i < programmingBook.length; i++) {
            if (programmingBook[i].getLanguage().equals("Java")) {
                countProgram += 1;
            }
        }
        System.out.println("Số cuốn sách có ngôn ngữ Java là :\n" + countProgram + " cuốn");

        //Đếm số sách Fiction có catogery là "Viễn Tưởng 1"
        for (int i = 0; i < fictionBook.length; i++) {
            if (fictionBook[i].getCategory().equals("Viễn Tưởng 1")) {
                countFiction += 1;
            }
        }
        System.out.println("Số cuốn sách có ngôn ngữ Java là :\n" + countFiction + " cuốn");

        //Đếm số sách Fiction có giá nhỏ hơn 100
        for (int i = 0; i < fictionBook.length; i++) {
            if (fictionBook[i].getPrice() < 100) {
                countPriceFiction += 1;
            }
        }
        System.out.println("Số cuốn sách Fiction có giá nhỏ hơn 100 là :\n" + countPriceFiction + " cuốn");
    }
}