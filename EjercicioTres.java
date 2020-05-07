import javax.swing.*;
import javax.swing.JOptionPane;
public class EjercicioTres {
    public static void main(String arg[]){

        {
            int nota = 10;
            int nota1 =9;
            int nota2=8;
            double nota3=8.99;
            int nota4=7;
            double nota5=7.99;
            int nota6=6;
            double nota7 =6.99;
            double nota8 =6 ;
           int resultado ;
            resultado = (int) Double.parseDouble(JOptionPane.showInputDialog(" escriba la nota "));

            {if (resultado == nota )

                JOptionPane.showMessageDialog(null, "su calificacion es A "  );

                if (resultado == nota1 )
                    JOptionPane.showMessageDialog(null, "su calificacion es A "  );

                    if (resultado == nota2 )
                        JOptionPane.showMessageDialog(null, "su calificacion es B "  );

                         if (resultado == nota3 )
                             JOptionPane.showMessageDialog(null, "su calificacion es B "  );
                             if (resultado == nota4 )
                             JOptionPane.showMessageDialog(null, "su calificacion es C "  );

                             if (resultado == nota5 )
                              JOptionPane.showMessageDialog(null, "su calificacion es C "  );

                                    if (resultado <= nota6 )
                    JOptionPane.showMessageDialog(null, "su calificacion es D "  );

                    else


                        JOptionPane.showMessageDialog(null, "INGRESE NUEVAMENTE UN VALOR " );
                    }
                }
            }
}