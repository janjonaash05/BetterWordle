package ActionCommands;

import Frames.StatsFrame;
import com.company.ColorTheme;
import com.company.SavedData;

public class ActionClearData extends DefaultAction implements ActionCommand {
    public ActionClearData(ColorTheme theme) {
        super(theme);
    }


    /**
     * <p>
     * Creates an empty attemptList, which is then saved to the ser file.
     * <p>
     * Displays a new ClearDataFrame.
     */
    @Override
    public void execute() {


        SavedData.createAttemptList();
        SavedData.writeToFile();

        new StatsFrame(theme);


    }

    @Override
    public String message() {
        return "Yes";
    }
}
