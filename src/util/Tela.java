package util;
import java.util.Date;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public class Tela {
    public static String nextString(String mensagem){
       return JOptionPane.showInputDialog(mensagem); 
    }
    
    public static double nextDouble(String mensagem){
        String valor = nextString(mensagem);
        if (valor == null){
            return 0;
        }
        valor = valor.trim().replace(".", "").replace(",", ".");
        try {
            return Double.parseDouble(valor);
        } catch (Exception e){
            exibirMensagem("Número inválido");
            return nextDouble(mensagem);
        }    
    }
    
    public static int nextInt(String mensagem){
        try {
            String valor = nextString(mensagem);
            
            if(valor != null){
                return Integer.parseInt(valor.trim());
            }
            return 0;
        } catch (Exception e) {
            exibirMensagem ("Número invlálido!");
            return nextInt(mensagem);
        }
    }
    
    public static Date nextDate (String mensagem){
        String data = nextString(mensagem);
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yy");
        try {
            return df.parse(data);
        } catch (Exception e) {
            return null;
        }
    }  
    
    public static void exibirMensagem(String mensagem){
        JOptionPane.showMessageDialog(null, mensagem);
    }
} 
