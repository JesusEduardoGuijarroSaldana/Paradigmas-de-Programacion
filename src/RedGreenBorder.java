/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guija
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;

import javax.swing.AbstractButton;
import javax.swing.ButtonModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.AbstractBorder;
import javax.swing.border.Border;

public class RedGreenBorder extends AbstractBorder {
  public boolean isBorderOpaque() {
    return true;
  }

  public Insets getBorderInsets(Component c) {
    return new Insets(3, 3, 3, 3);
  }

  public void paintBorder(Component c, Graphics g, int x, int y, int width,
      int height) {
    Insets insets = getBorderInsets(c);
    Color horizontalColor;
    Color verticalColor;
    if (c.isEnabled()) {
      boolean pressed = false;
      if (c instanceof AbstractButton) {
        ButtonModel model = ((AbstractButton) c).getModel();
        pressed = model.isPressed();
      }
      if (pressed) {
        horizontalColor = Color.red;
        verticalColor = Color.green;
      } else {
        horizontalColor = Color.green;
        verticalColor = Color.red;
      }
    } else {
      horizontalColor = Color.lightGray;
      verticalColor = Color.lightGray;
    }
    g.setColor(horizontalColor);

    g.translate(x, y);

    // top
    g.fillRect(0, 0, width, insets.top);
    // bottom
    g.fillRect(0, height - insets.bottom, width, insets.bottom);

    g.setColor(verticalColor);
    // left
    g.fillRect(0, insets.top, insets.left, height - insets.top  - insets.bottom);
      g.fillRect(width - insets.right, insets.top, insets.right, height- insets.top - insets.bottom);
    g.translate(-x, -y);
  }

  public static void main(String args[]) {
    JFrame frame = new JFrame("My Border");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Border border = new RedGreenBorder();
    JButton helloButton = new JButton("Hello");
    helloButton.setBorder(border);
    JButton braveButton = new JButton("Brave New");
    braveButton.setBorder(border);
    braveButton.setEnabled(false);
    JButton worldButton = new JButton("World");
    worldButton.setBorder(border);
    Container contentPane = frame.getContentPane();
    contentPane.add(helloButton, BorderLayout.NORTH);
//    contentPane.add(braveButton, BorderLayout.CENTER);
//    contentPane.add(worldButton, BorderLayout.SOUTH);
    frame.setSize(300, 100);
    frame.setVisible(true);
  }
}
