package packageappagenda;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class TestaAgenda {
    public static void main(String args[]) {
        ArrayList agenda = new ArrayList();
        Pessoa p = new Agenda(1, "Ramon", 35331645);
        Pessoa p2 = new Agenda(2, "Teste", 99454545);
        agenda.add(p);
        agenda.add(p2);
        JOptionPane.showMessageDialog(null, agenda.isEmpty()); /*retorna que EXISTEM dados na lista*/
        JOptionPane.showMessageDialog(null, agenda); /*creio que deveria exibir os atributos dos objetos "P" e "P2", correto?*/
    }
}
