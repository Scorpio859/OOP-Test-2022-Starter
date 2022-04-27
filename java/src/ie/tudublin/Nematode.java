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

    //nematode constructer
    Nematode(processing.data.TableRow row){
        //getting the information from the CSV file via tablerow
        Name = row.getString("name");
        Length = row.getInt("length");
        Limbs = row.getInt("limbs");
        gender = row.getString("gender");
        eyes = row.getInt("eyes");
        
    }
}
