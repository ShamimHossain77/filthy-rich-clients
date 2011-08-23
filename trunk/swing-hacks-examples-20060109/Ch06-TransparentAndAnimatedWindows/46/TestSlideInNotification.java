import javax.swing.*;


public class TestSlideInNotification {

    public static void main (String[] args) {
        Icon errorIcon = UIManager.getIcon ("OptionPane.errorIcon");
        JLabel label = new JLabel ("Your application asplode",
                                   errorIcon,
                                   SwingConstants.LEFT);
        SlideInNotification slider = new SlideInNotification (label);
        slider.showAt (450);

    }

}
