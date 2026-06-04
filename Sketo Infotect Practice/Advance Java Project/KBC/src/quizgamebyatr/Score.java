package quizgamebyatr;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Score extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;

    PreparedStatement ps;
    Connection con;
    ResultSet rs;

    Score(String username, int score) {
        setBounds(100, 50, 1100, 572);
        getContentPane().setBackground(Color.lightGray);
        setLayout(null);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/KBC", "root", "Jishan@9136");
            System.out.println("Connection created");
            ps = con.prepareStatement("insert into quiz values(?,?);");
            ps.setString(1, username);
            ps.setInt(2, score);
            ps.executeUpdate();
            ps.close();
        } catch (Exception e1) {
            e1.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error connecting to the database", "Error", JOptionPane.ERROR_MESSAGE);
        }

        // Load image resource
        ImageIcon i1 = new ImageIcon(Score.class.getResource("/icons/score.png"));
        Image i2 = i1.getImage().getScaledInstance(550, 572, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0, 0, 550, 572);
        add(l1);

        JLabel l2 = new JLabel("Thank you For Playing.");
        l2.setBounds(650, 200, 300, 150);
        l2.setFont(new Font("RALEWAY", Font.PLAIN, 22));
        add(l2);

        JLabel l3 = new JLabel("Your Score Is " + score);
        l3.setBounds(720, 300, 200, 30);
        l3.setFont(new Font("Jokerman", Font.PLAIN, 22));
        l3.setForeground(Color.magenta);
        add(l3);

        JButton b1 = new JButton("Check");
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String name = JOptionPane.showInputDialog(b1, "Enter name: ");
                    ps = con.prepareStatement("select * from quiz where username=?");
                    ps.setString(1, name);
                    rs = ps.executeQuery();
                    if (rs.next()) {
                        JOptionPane.showMessageDialog(b1, rs.getString(2));
                    } else {
                        JOptionPane.showMessageDialog(b1, "Wrong Credentials.");
                    }
                } catch (Exception e1) {
                    e1.printStackTrace();
                    JOptionPane.showMessageDialog(Score.this, "Error retrieving data from the database", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        b1.setBackground(Color.YELLOW);
        b1.setForeground(Color.BLACK);
        b1.setBounds(750, 400, 100, 50);
        add(b1);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Score("", 0).setVisible(true));
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        this.setVisible(false);
        new Quizgamebyatr().setVisible(true);
    }
}
