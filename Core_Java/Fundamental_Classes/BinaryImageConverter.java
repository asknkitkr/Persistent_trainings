import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class BinaryImageConverter extends JFrame {
    private JTextArea inputTextArea;
    private BufferedImage image;
    private JLabel imageLabel;

    public BinaryImageConverter() {
        super("Binary Image Converter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 450);

        // Create the input text area
        inputTextArea = new JTextArea();
        inputTextArea.setLineWrap(true);
        inputTextArea.setWrapStyleWord(true);
        JScrollPane inputScrollPane = new JScrollPane(inputTextArea);
        inputScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        inputScrollPane.setPreferredSize(new Dimension(350, 200));

        // Create the "Convert" button
        JButton convertButton = new JButton("Convert");
        convertButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String inputText = inputTextArea.getText();
                String binaryText = convertToBinary(inputText);
                createImage(binaryText);
            }
        });

        // Create the image label
        image = new BufferedImage(256, 256, BufferedImage.TYPE_BYTE_BINARY);
        imageLabel = new JLabel(new ImageIcon(image));

        // Create the "Save Image" button
        JButton saveImageButton = new JButton("Save Image");
        saveImageButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setDialogTitle("Save Image");
                int userSelection = fileChooser.showSaveDialog(BinaryImageConverter.this);
                if (userSelection == JFileChooser.APPROVE_OPTION) {
                    File fileToSave = fileChooser.getSelectedFile();
                    try {
                        ImageIO.write(image, "png", fileToSave);
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });

        // Add the components to the frame
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(inputScrollPane, BorderLayout.NORTH);
        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.add(convertButton);
        buttonPanel.add(saveImageButton);
        mainPanel.add(buttonPanel, BorderLayout.CENTER);
        mainPanel.add(imageLabel, BorderLayout.SOUTH);
        setContentPane(mainPanel);
    }

    private String convertToBinary(String inputText) {
        StringBuilder binaryStringBuilder = new StringBuilder();
        for (char c : inputText.toCharArray()) {
            String binaryString = Integer.toBinaryString(c);
            while (binaryString.length() < 8) {
                binaryString = "0" + binaryString;
            }
            binaryStringBuilder.append(binaryString);
        }
        return binaryStringBuilder.toString();
    }

    private void createImage(String binaryText) {
        int index = 0;
        for (int i = 0; i < image.getHeight(); i++) {
            for (int j = 0; j < image.getWidth(); j++) {
                if (index >= binaryText.length()) {
                    image.setRGB(j, i, Color.WHITE.getRGB());
                } else if (binaryText.charAt(index) == '1') {
                    image.setRGB(j, i, Color.BLACK.getRGB());
                } else {
                    image.setRGB(j, i, Color.WHITE.getRGB());
                }
                index++;
            }
        }
        imageLabel.setIcon(new ImageIcon(image));
    }

    public static void main(String[] args) {
        BinaryImageConverter converter = new BinaryImageConverter();
        converter.setVisible(true);
    }
}
