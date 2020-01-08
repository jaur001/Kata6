package loader;

import controller.Command;

import java.util.Map;

public interface CommandLoader {
    Map<String, Command> load();
}
