package ActionCommands;

import Frames.MoreRulesFrame;
import com.company.ColorTheme;

import java.awt.*;

import static com.company.Constants.ACTION_SIZE;
import static com.company.Constants.INFO_SIZE;

public class ActionShowMoreRules extends DefaultAction implements ActionCommand {
    public ActionShowMoreRules(ColorTheme theme) {
        super(theme);
    }


    /**
     * Displays a new MoreRulesFrame.
     */
    @Override
    public void execute() {


        new MoreRulesFrame(theme, new Dimension(950, (int) (INFO_SIZE.getHeight() *2+ ACTION_SIZE.getHeight())-50));
    }

    @Override
    public String message() {
        return "More";
    }
}
