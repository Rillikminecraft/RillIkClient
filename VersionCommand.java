package fun.rich.client.command.impl;


import com.mojang.realmsclient.gui.ChatFormatting;
import fun.rich.client.Rich;
import fun.rich.client.command.CommandAbstract;
import fun.rich.client.utils.other.ChatUtils;

public class VersionCommand
        extends CommandAbstract {
    public VersionCommand() {
        super("Version", "Version", ".Version", "version");
    }

    @Override
    public void execute(String... args) {
        if (args.length == 1) {
            if (args[0].equals("Version")) {
                ChatUtils.addChatMessage(ChatFormatting.GREEN + "VersionClient: 1.0");
            }
        } else {
            ChatUtils.addChatMessage(this.getUsage());
        }
    }
}
