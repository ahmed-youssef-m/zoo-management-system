package data;

import javafx.scene.image.Image;

public class Monkey extends Animal{
    
    public Monkey() {
    }
    
    public Monkey(String info, String specie ,int cageNo,String name,Image anImage) {
        super(info, specie,cageNo ,name,anImage);
    }

    @Override
    public void setInfo(String info) {
        this.info=info;
    }

    @Override
    public String getInfo() {
        return "The info : \n"+
                 "is a common name that may refer to most mammals of the infraorder Simiiformes,\n" +
                 "also known as the simians. Traditionally, all animals in the group now known as\n" +
                        " simians are counted as monkeys except the apes, which constitutes an incomplete\n"; 
    }

    @Override
    public void setSpecie(String specie) {
      this.specie=specie;  
    }

    @Override
    public String getSpecie() {
        return "The specie of monkey is : Callitrichidae\n";
    }

    @Override 
    public void setCageNo(int cageNo){
        this.cageNo=cageNo;
    }

    @Override 
    public int getCageNo(){
        return 2;
    }

    @Override
    public void setName(String name) {
        this.name=name;
    }

    @Override
    public String getName() {
        
        return "Monkey";
    }
    
    @Override
    public void setImage(Image anImage) {
        this.anImage=anImage;
    }

    @Override
    public Image getAnImage() {
        Image clasImage=new Image(getClass().getResourceAsStream("/zoo/images/monkey.jpg"));
        return clasImage;
    }
    
}