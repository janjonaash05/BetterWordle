package Frames;

import com.company.ActionBox;
import ActionCommands.ActionShowRules;
import com.company.ColorTheme;
import com.company.InfoLabel;

import java.awt.*;

import static com.company.Constants.*;

public class MoreRulesFrame extends DefaultFrame {
    /**
     * Sets up the MoreRulesFrame
     *
     * @param theme
     * @param size
     */
    public MoreRulesFrame(ColorTheme theme, Dimension size) {
        super(theme, size);


        InfoLabel l1 = new InfoLabel("If no letters are highlighted or you don't continue to next row, the word is not considered valid.", new Point(0,0), theme);
        l1.setSize(getWidth(), (int) INFO_SIZE.getHeight());
        l1.setFont(new Font(l1.getName(), Font.BOLD, 20));

        pane.add(l1);
        InfoLabel l2 = new InfoLabel("Pressing ESC quits to main menu, resulting in a failed attempt.", new Point(0, (int) INFO_SIZE.getHeight()-50), theme);
        l2.setSize(l1.getSize());
        l2.setFont(l1.getFont());
        pane.add(l2);

        ActionBox box = new ActionBox(new Point(LETTER_DISTANCE_MARGIN, (int) (getHeight()-ACTION_SIZE.getHeight()-LETTER_DISTANCE_MARGIN)), theme, new ActionShowRules(theme), this);
        box.setText("Back");
        box.setSize(new Dimension(getWidth()- LETTER_DISTANCE_MARGIN*2, (int) ACTION_SIZE.getHeight()));
        pane.add(box);


    }
}
