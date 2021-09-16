package interface1;


import busines.User;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaUsers extends JFrame {


    JLabel lb_id, lb_name, lb_sexo, lb_password;
    JTextField tf_id, tf_name, tf_password;
    JComboBox cb_sexo;
    JButton bt_salvar, bt_limpar, bt_fechar;

    @SuppressWarnings("rawtypes")
    public TelaUsers(){
        setTitle("Cadastro de Veículos");
        setSize(550, 450);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        lb_id        = new JLabel("id");
        lb_password        = new JLabel("password");
        lb_name     = new JLabel("nome");
        lb_sexo       = new JLabel("sexo");
        tf_id      = new JTextField("");
        tf_name   = new JTextField("");
        tf_password   = new JTextField("");
        cb_sexo         = new JComboBox();
        bt_salvar       = new JButton("Salvar");
        bt_limpar       = new JButton("Limpar");
        bt_fechar       = new JButton("Fechar");

        String[] sexo = new String[]{"Selecione seu sexo","masculino", "feminino"};

        cb_sexo.setModel(new javax.swing.DefaultComboBoxModel(sexo));


        getContentPane().setLayout(null);

        getContentPane().add(lb_name);
        getContentPane().add(lb_sexo);
        getContentPane().add(lb_password);
        getContentPane().add(lb_id);
        getContentPane().add(cb_sexo);
        getContentPane().add(tf_name);
        getContentPane().add(tf_password);
        getContentPane().add(tf_id);
        getContentPane().add(bt_salvar);
        getContentPane().add(bt_limpar);
        getContentPane().add(bt_fechar);


        lb_id        .setBounds(20, 20, 100, 15);
        tf_id       .setBounds(20, 40, 80, 25);

        lb_name      .setBounds(115,20, 100, 15);
        tf_name      .setBounds(115,40, 150, 25);

        lb_password      .setBounds(20, 70, 100, 15);
        tf_password      .setBounds(20, 90, 150, 25);

        lb_sexo       .setBounds(20, 120,300, 15);
        cb_sexo       .setBounds(20, 140,250, 25);


        bt_salvar       .setBounds(20,340,80, 30);
        bt_limpar       .setBounds(105,340,80, 30);
        bt_fechar       .setBounds(190,340,80, 30);


        bt_salvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                User veiculo = new User();
                veiculo.setName(tf_name.getText());

                JOptionPane.showMessageDialog(null, tf_name.getText());

            }
        });

        bt_limpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Clicou em limpar");
            }
        });

        bt_fechar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Clicou em fechar");
            }
        });

        setVisible(true);
    }
}



