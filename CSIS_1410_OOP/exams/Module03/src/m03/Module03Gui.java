package m03;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

/**
 * This class is a basic input form that intakes your name and your feedback and a "thank you" message
 * that contains the user's name upon form submission
 *
 * @author Josh Sorensen
 * @class CSIS 1410
 */
public class Module03Gui extends JFrame {

    private static final long serialVersionUID = 1L;

    // Input fields
    private JTextField nameField;
    private JEditorPane feedbackTextPane;
    private JScrollPane scrollPane;

    // Labels
    private JLabel submissionLabel;

    /**
     * Main method used to initialize and run the application.
     *
     * @param args CLI arguments
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Module03Gui frame = new Module03Gui();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Module03Gui() {
        initializeFrame();
        createComponents();
        layoutComponents();
    }

    private void initializeFrame() {
        setTitle("Feedback Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 500);
        setLocationRelativeTo(null);
    }

    private void createComponents() {
        nameField = new JTextField(20);
        nameField.setFont(new Font("Chalkboard", Font.PLAIN, 16));

        feedbackTextPane = new JEditorPane();
        feedbackTextPane.setFont(new Font("Chalkboard", Font.PLAIN, 14));
        scrollPane = new JScrollPane(feedbackTextPane);
        scrollPane.setPreferredSize(new Dimension(300, 100));
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

        submissionLabel = new JLabel("");
        submissionLabel.setFont(new Font("Chalkboard", Font.BOLD, 16));
        submissionLabel.setForeground(Color.BLUE);
        submissionLabel.setVisible(false);
    }

    private void layoutComponents() {
        JPanel contentPane = new JPanel(new BorderLayout(10, 10));
        contentPane.setBorder(new EmptyBorder(20, 20, 20, 20));
        setContentPane(contentPane);

        JPanel topPanel = createTopPanel();
        contentPane.add(topPanel, BorderLayout.NORTH);

        JPanel centerPanel = createCenterPanel();
        contentPane.add(centerPanel, BorderLayout.CENTER);

        JPanel bottomPanel = createBottomPanel();
        contentPane.add(bottomPanel, BorderLayout.SOUTH);
    }

    private JPanel createTopPanel() {
        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));

        ImageIcon imageIcon = new ImageIcon(Objects.requireNonNull(getClass().getResource("/form.jpg")));
        Image scaledImage = imageIcon.getImage().getScaledInstance(75, 75, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        JLabel logoLabel = new JLabel(scaledIcon);
        topPanel.add(logoLabel);

        return topPanel;
    }

    private JPanel createCenterPanel() {
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));
        centerPanel.setBorder(new EmptyBorder(10, 0, 10, 0));

        JPanel nameSection = createInlineFieldSection("Enter Your Name:", nameField);
        centerPanel.add(nameSection);

        centerPanel.add(Box.createVerticalStrut(20));

        JPanel feedbackSection = createFieldSection("Enter Your Feedback:", scrollPane);
        centerPanel.add(feedbackSection);

        return centerPanel;
    }


    private JPanel createInlineFieldSection(String labelText, JComponent inputComponent) {
        JPanel section = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 0));
        section.setAlignmentX(Component.LEFT_ALIGNMENT);

        JLabel label = new JLabel(labelText);
        label.setFont(new Font("Chalkboard", Font.PLAIN, 18));

        section.add(label);
        section.add(inputComponent);

        return section;
    }

    private JPanel createFieldSection(String labelText, JComponent inputComponent) {
        JPanel section = new JPanel();
        section.setLayout(new BoxLayout(section, BoxLayout.Y_AXIS));
        section.setAlignmentX(Component.LEFT_ALIGNMENT);

        JLabel label = new JLabel(labelText);
        label.setFont(new Font("Chalkboard", Font.PLAIN, 18));
        label.setAlignmentX(Component.LEFT_ALIGNMENT);

        inputComponent.setAlignmentX(Component.LEFT_ALIGNMENT);

        section.add(label);
        section.add(inputComponent);

        return section;
    }

    private JPanel createBottomPanel() {
        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new BoxLayout(bottomPanel, BoxLayout.Y_AXIS));
        bottomPanel.setBorder(new EmptyBorder(20, 0, 0, 0));

        JButton submitButton = new JButton("Submit Form");
        submitButton.setFont(new Font("Chalkboard", Font.PLAIN, 18));
        submitButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleFormSubmission();
            }
        });

        bottomPanel.add(submitButton);
        bottomPanel.add(Box.createVerticalStrut(10));

        submissionLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        bottomPanel.add(submissionLabel);

        return bottomPanel;
    }

    private void handleFormSubmission() {
        String userName = nameField.getText().trim();

        // render "error" dialog box if name is empty
        if (userName.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter your name.", "Missing Information", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // render the "thank you" message
        submissionLabel.setText("Thank you for your feedback, " + userName + "!");
        submissionLabel.setVisible(true);

        clearInputFields();
    }

    private void clearInputFields() {
        nameField.setText("");
        feedbackTextPane.setText("");
    }
}