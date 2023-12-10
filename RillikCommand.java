package fun.rich.client.command.impl;


import com.mojang.realmsclient.gui.ChatFormatting;
import fun.rich.client.command.CommandAbstract;
import fun.rich.client.utils.other.ChatUtils;

public class RillikCommand
        extends CommandAbstract {
    public RillikCommand() {
        super("Rillik", "Rillik", ".Rillik", "Rillik");
    }

    @Override
    public void execute(String... args) {
        if (args.length == 1) {
            if (args[0].equals("Rillik")) {
                ChatUtils.addChatMessage(ChatFormatting.GREEN + "RillikCommand:");
                ChatUtils.addChatMessage(ChatFormatting.WHITE + ".Ver - покажет версию клиента (текущаю)");
            }
        } else {
            ChatUtils.addChatMessage(this.getUsage());
        }
    }
}
