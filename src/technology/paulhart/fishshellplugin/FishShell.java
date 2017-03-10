package technology.paulhart.fishshellplugin;

/**
 * Created by phart on 3/9/17.
 */

import com.intellij.lang.Language;

public class FishShell extends Language {
    public static final FishShell INSTANCE = new FishShell();

    private FishShell() {
        super("FishShell");
    }

}
