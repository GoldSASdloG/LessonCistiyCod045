public class ProduktMeneger {
    public void addProdukt(){
        //!!!!!
    }
    public void displayProdukt(){
        //!!!!!
    }
    // вот так делать нельзя уже по методу SRP уже не проходит
    // это два разных класса (addProdukt displayProdukt) их
    // нельзя в один ProduktMeneger запехивать!!!!
    // дава совершенно разных метода в одном классе лучше их раскидать по своим классам
    
}
