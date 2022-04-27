package ie.tudublin;

import java.util.jar.Attributes.Name;

import javax.swing.text.TableView.TableRow;

//Nematode class
class Nematode {
    
    //class attributes
    String Name;
    int Length;
    int Limbs;
    String gender;
    int eyes;
    float temp;

    public Nematode(processing.data.TableRow row){
        //getting the information from the CSV file via tablerow
        this(row.getString("name"),
        row.getInt("length"),
        row.getInt("limbs"),
        row.getString("gender"),
        row.getInt("eyes"));
        
    }

    public Nematode(String Name, int Length, int Limbs, String gender, int eyes) {
        this.Name = Name;
        this.Length = Length;
        this.Limbs = Limbs;
        this.gender = gender;
        this. eyes = eyes;

    }

    //toString method
    public String toString(){

        return Name
            + "," + Length
            + "," + Limbs
            + "," + gender
            + "," + eyes;
    }

    //getting info
    public String getName() {
        return Name;
    }

    public int getLength() {
        return Length;
    }

    public int getLimbs() {
        return Limbs;
    }

    public String getgender() {
        return gender;
    }

    public int geteyes() {
        return eyes;
    }

    //setting info
    public void setName() {
        this.Name = Name;
    }

    public void setLength() {
        this.Length = Length;
    }

    public void setLimbs() {
        this.Limbs = Limbs;
    }

    public void setgender() {
        this.gender = gender;
    }

    public void seteyes() {
        this.eyes = eyes;
    }
    
    //rendering the nematode
    public Nematode render(NematodeVisualiser nematode) {
        float x = nematode.width/2;
        float y = nematode.height/4;

        //printing the name of the worm
        nematode.text(Name, x-10, y-100);

        //forming the body of nematode
        for(int i = 0; i < Length; i++)
        {
            temp = y + (i*50);
            nematode.circle(x, temp, 50);

        } 
    }

}
