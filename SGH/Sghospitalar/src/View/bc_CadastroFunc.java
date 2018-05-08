package View;

import Implementação.zc_EnviaDados_Banco_Funcionario;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import Implementação.zc_Funcionario;

public class bc_CadastroFunc extends JFrame implements ActionListener{
    
    zc_EnviaDados_Banco_Funcionario zz = new zc_EnviaDados_Banco_Funcionario();
    
    JButton bConfirmar, bCancelar;
    JLabel labelNome, labelCpf, labelRg, labelCargo, labelSenha, labelConfirmarSenha, labelEmail, labelNumCell, labelInfo;
    JTextField textNome, textCpf, textRg, textCargo, textSenha, textConfirmarSenha, textEmail, textNumCell;
    JTextPane pane1, paneSombra1, pane2, paneSombra2, pane3, paneSombra3;
    
    public bc_CadastroFunc(){
        
        Container c = this.getContentPane();
        c.setLayout(null);
        
        labelNome = new JLabel();
        labelNome.setText("Nome completo:");
        labelNome.setBounds(20, 15, 150, 20);
        add(labelNome);
        
        labelCpf = new JLabel();
        labelCpf.setText("Cpf:");
        labelCpf.setBounds(20, 45, 100, 20);
        add(labelCpf);
        
        labelRg = new JLabel();
        labelRg.setText("RG:");
        labelRg.setBounds(20, 75, 100, 20);
        add(labelRg);
        
        textNome = new JTextField();
        textNome.setBounds(139, 16, 642, 20);
        textNome.setBackground(Color.WHITE);
        textNome.setBorder(new LineBorder(Color.BLACK));
        add(textNome);
        
        textCpf = new JTextField();
        textCpf.setBounds(53, 46, 300, 20);
        textCpf.setBackground(Color.WHITE);
        textCpf.setBorder(new LineBorder(Color.BLACK));
        add(textCpf);
        
        textRg = new JTextField();
        textRg.setBounds(49, 76, 230, 20);
        textRg.setBackground(Color.WHITE);
        textRg.setBorder(new LineBorder(Color.BLACK));
        add(textRg);
        
        pane1 = new JTextPane();
        pane1.setBounds(10, 10, 780, 100);
        pane1.setBackground(Color.WHITE);
        pane1.setBorder(new LineBorder(Color.BLACK));
        pane1.setEditable(false);
        add(pane1);
        
        paneSombra1 = new JTextPane();
        paneSombra1.setBounds(15, 15, 780, 100);
        paneSombra1.setBackground(Color.GRAY);
        paneSombra1.setEditable(false);
        add(paneSombra1);
        
        labelCargo = new JLabel();
        labelCargo.setText("Cargo:");
        labelCargo.setBounds(20, 135, 100, 20);
        add(labelCargo);
        
        labelNumCell = new JLabel();
        labelNumCell.setText("Telefone:");
        labelNumCell.setBounds(20, 165, 100, 20);
        add(labelNumCell);
        
        labelEmail = new JLabel();
        labelEmail.setText("Email:");
        labelEmail.setBounds(290, 135, 100, 20);
        add(labelEmail);
        
        textCargo = new JTextField();
        textCargo.setBounds(72, 136, 200, 20);
        textCargo.setBackground(Color.WHITE);
        textCargo.setBorder(new LineBorder(Color.BLACK));
        add(textCargo);
        
        textNumCell = new JTextField();
        textNumCell.setBounds(93, 166, 200, 20);
        textNumCell.setBackground(Color.WHITE);
        textNumCell.setBorder(new LineBorder(Color.BLACK));
        add(textNumCell);
        
        textEmail = new JTextField();
        textEmail.setBounds(337, 136, 290, 20);
        textEmail.setBackground(Color.WHITE);
        textEmail.setBorder(new LineBorder(Color.BLACK));
        add(textEmail);
        
        pane2 = new JTextPane();
        pane2.setBounds(10, 130, 780, 70);
        pane2.setBackground(Color.WHITE);
        pane2.setBorder(new LineBorder(Color.BLACK));
        pane2.setEditable(false);
        add(pane2);
          
        paneSombra2 = new JTextPane();
        paneSombra2.setBounds(15, 135, 780, 70);
        paneSombra2.setBackground(Color.GRAY);
        paneSombra2.setEditable(false);
        add(paneSombra2);
        
        labelSenha = new JLabel();
        labelSenha.setText("SENHA:");
        labelSenha.setForeground(Color.red);
        labelSenha.setBounds(20, 225, 100, 20);
        add(labelSenha);
        
        labelInfo = new JLabel();
        labelInfo.setText("(Pode conter letras, numeros e simbolos. No max 8 caracteres e no min 6.)");
        labelInfo.setForeground(Color.red);
        labelInfo.setBounds(240, 245, 600, 20);
        add(labelInfo);
        
        labelConfirmarSenha = new JLabel();
        labelConfirmarSenha.setText("Confirme sua SENHA:");
        labelConfirmarSenha.setForeground(Color.red);
        labelConfirmarSenha.setBounds(20, 270, 150, 20);
        add(labelConfirmarSenha);
        
        textSenha = new JTextField();
        textSenha.setBounds(20, 245, 200, 20);
        textSenha.setBackground(Color.WHITE);
        textSenha.setBorder(new LineBorder(Color.BLACK));
        add(textSenha);
        
        textConfirmarSenha = new JTextField();
        textConfirmarSenha.setBounds(20, 290, 200, 20);
        textConfirmarSenha.setBackground(Color.WHITE);
        textConfirmarSenha.setBorder(new LineBorder(Color.BLACK));
        add(textConfirmarSenha);
        
        pane3 = new JTextPane();
        pane3.setBounds(10, 220, 780, 105);
        pane3.setBackground(Color.WHITE);
        pane3.setBorder(new LineBorder(Color.BLACK));
        pane3.setEditable(false);
        add(pane3);
        
        paneSombra3 = new JTextPane();
        paneSombra3.setBounds(15, 225, 780, 105);
        paneSombra3.setBackground(Color.GRAY);
        paneSombra3.setEditable(false);
        add(paneSombra3);
        
        bConfirmar = new JButton();
        bConfirmar.setText("Confirmar");
        bConfirmar.setBounds(116, 372, 220, 45);
        bConfirmar.setBackground(Color.decode("#00FF7F"));
        bConfirmar.setBorder(new LineBorder(Color.BLACK));
        bConfirmar.addActionListener(this);
        bConfirmar.setFocusPainted(false);
        add(bConfirmar);
        
        bCancelar = new JButton();
        bCancelar.setText("Cancelar");
        bCancelar.setForeground(Color.WHITE);
        bCancelar.setBounds(450, 372, 220, 45);
        bCancelar.setBackground(Color.decode("#FF6347"));
        bCancelar.setBorder(new LineBorder(Color.BLACK));
        bCancelar.addActionListener(this);
        bCancelar.setFocusPainted(false);
        add(bCancelar);
        
        setTitle("Cadastro Funcionario");
        setSize(800, 500);
        getContentPane().setBackground(Color.decode("#E0EEEE"));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        
    }

     @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == bCancelar) {
            ca_MenuFunc telamenumaster = new ca_MenuFunc();
            dispose();

        }

        if (e.getSource() == bConfirmar) {
            //ba_MenuMaster telamenumaster = new ba_MenuMaster();
            //dispose();

            MandaCampo_Funcionario();
            

        }

    }

    public void MandaCampo_Funcionario() {

        String a, a1, a2, a3, a4, a5, a6, a7, a8 = null;

        
         zc_Funcionario funcionario = new zc_Funcionario(
                        textNome.getText(), 
                        textCargo.getText(),
                        textSenha.getText(),
                        textEmail.getText(),
                        textNumCell.getText()
                       
                );
        
       
        zz.Cadastra(funcionario);
        
    }
    
    public Boolean campoVazioString(String texto){
        if(texto==null || texto.trim().equals("")){
            return true;
        }   
        return false;
        
    }
    
    public Boolean campoVazioInt(Integer texto){
        if(texto == null){
            return true;
        }   
        return false;
        
    }
    
    public Boolean campoCompleto(String nome, int cpf, int rg, String cargo, String num, String email){
        if((campoVazioString(nome)&&campoVazioInt(cpf)&&campoVazioInt(rg)&&campoVazioString(cargo)&&campoVazioString(num)&&campoVazioString(email))==true){
            return true;
        }else{
            return false;
        }
    }
    
    public Boolean conterNumeros(String texto){
        for (int i = 0; i < texto.length(); i++) {
            if (Character.isDigit(texto.charAt(i))==true){
                return true;
            }
        }
        return false;
    }
    
    
    public Boolean cpfNumerosSize(int cpf){
        if(String.valueOf(cpf).length()==11){
            return true;
        }else{
            return false;
        }
    }
    
    public Boolean rgNumerosSize(int rg){
        if(String.valueOf(rg).length()==9){
            return true;
        }else{
            return false;
        }
    }
    
    public Boolean campoSemEspaco(String texto){
        if (texto.contains(" ")){
	    return false;
	}else{
	    return true;
	}
    }
    
    public Boolean semConterCaracteresEspeciais(String texto){
	if (texto.matches("[a-zA-Z_][a-zA-Z0-9_]*"))
            return false;
	else
	    return true;
    }
    public Boolean emailEstrutura(String texto){
        if (texto.contains("@")&&texto.contains(".com")){
	    return false;
	}else{
	    return true;
	}
    }
    
    public Boolean semConterNumeros(int texto){
        
    }
    
    public static void main(String[] args) {
        new bc_CadastroFunc();
    }

    
}