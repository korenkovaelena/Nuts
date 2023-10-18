public class Tree {
    public static Nut[] growNutArr(int quantity){
        Nut[] nutArr = new Nut[quantity];
        for (int i = 0; i<quantity; i++){
             nutArr[i] = new Nut();
        }
        return nutArr;
    }
}
