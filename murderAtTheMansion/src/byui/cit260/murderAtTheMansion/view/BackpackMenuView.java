/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.murderAtTheMansion.view;



public class BackpackMenuView extends View {
    private String menu;
    private String menuOption;

    public BackpackMenuView() {
        super ("\n"
                  + "\n--------------------------------------"
                  + "\n| Backpack Menu                          |"
                  + "\n--------------------------------------"
                  + "\nC - Clues"
                  + "\nM - Murdered Files"
                  + "\nW - Weapons"
                  + "\nQ - Quit Backpack Menu"
                  + "\n--------------------------------------");
    }

    
    
    @Override 
    public boolean doAction(String choice) {
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "C":
                this.viewClues();
                break;
            case "S":
                this.viewSuspectFiles();
                break;
            case "M":
                this.murderedFile();
                break;
            case "W":
                this.backpackWeapons();
                break;
            default:
                ErrorView.display(this.getClass().getName(),"\n*** Invalid selection *** Try again");
                break;
        }
        
        return false;
    }

    


    private void viewSuspectFiles() {
        /*StringBuilder line;
        
        Game game = MurderAtTheMansion.getCurrentGame();
        Item[] item = game.getItem();
        
        System.out.println("\nLIST OF FILES");
        line = new StringBuilder("\n");
        line.insert(0, "DESCRIPTION");
        line.insert(20, "NAME");
        System.out.println(line.toString());
        
        for (Item itemList : item){
            line = new StringBuilder("\n");
            line.insert(0, itemList.getDescription());
            line.insert(23, itemList.getTitle());
            
            System.out.println(line.toString());
        }*/
        
    }

    private void murderedFile() {
        MurderedFileView murderedFileView = new MurderedFileView();
        murderedFileView.display();   
    }

    private void backpackWeapons() {
        BackpackWeaponsView backpackWeaponsView = new BackpackWeaponsView();
        backpackWeaponsView.display();   
    }

    private void viewClues() {
        ViewCluesView viewCluesView = new ViewCluesView();
        viewCluesView.display();    
    }
}

    
