package hospital.management.system;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class All_Patient_Info extends JFrame {


    All_Patient_Info(){

        JPanel panel=new JPanel();
        panel.setBounds(5,5,890,590);
        panel.setBackground(new Color(90,156,163));
        panel.setLayout(null);
        add(panel);

        JTable table=new JTable();
        table.setBounds(10,40,900,400);
        table.setBackground(new Color(90,156,163));
        table.setFont(new Font("Tahoma",Font.BOLD,12));
        panel.add(table);

        try {

            Connect c=new Connect();
            String q="select * from patient_info";
            ResultSet resultSet=c.statement.executeQuery(q);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));

        }catch (Exception e){
            e.printStackTrace();
        }

        JLabel label1=new JLabel("ID");
        label1.setBounds(31,11,100,14);
        label1.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(label1);

        JLabel label2=new JLabel("Number");
        label2.setBounds(130,11,100,14);
        label2.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(label2);

        JLabel label3=new JLabel("Name");
        label3.setBounds(240,11,100,14);
        label3.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(label3);

        JLabel label4=new JLabel("Gender");
        label4.setBounds(350,11,100,14);
        label4.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(label4);

        JLabel label5=new JLabel("Disease");
        label5.setBounds(460,11,100,14);
        label5.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(label5);

        JLabel label6=new JLabel("Room");
        label6.setBounds(575,11,100,14);
        label6.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(label6);

        JLabel label7=new JLabel("Time");
        label7.setBounds(685,11,100,14);
        label7.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(label7);

        JLabel label8=new JLabel("Deposit");
        label8.setBounds(800,11,100,14);
        label8.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(label8);

        JButton back=new JButton("Back");
        back.setBounds(400,450,120,30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.white);
        panel.add(back);

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });

        setUndecorated(true);

        setSize(900,600);
        setLayout(null);
        setLocation(300,200);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
    public static void main(String...args){
        new All_Patient_Info();
    }
}