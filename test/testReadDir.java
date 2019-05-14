
import java.io.File;
import java.util.ArrayList;
import model.Document;
import model.InvertedIndex;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author USER
 */
public class testReadDir {

    public static void main(String[] args) {
        File folder = new File("H:\\Semester 6\\Pemerolehan informasi\\Document");
        InvertedIndex index = new InvertedIndex();
        index.listAllFiles(folder);
        
        ArrayList<Document> listDoc = index.getListOfDocument();
        for (int i = 0; i < listDoc.size(); i++) {
            Document doc = listDoc.get(i);
            System.out.println("Content : "+doc.getId());
            System.out.println(doc.getContent());
        }
    }
}
