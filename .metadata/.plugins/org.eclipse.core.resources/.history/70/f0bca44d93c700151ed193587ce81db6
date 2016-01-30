package cc.adida.FunPL;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.rit.sucy.EnchantPlugin;

public class Main extends EnchantPlugin {
	@Override
	public void onEnable() {
		getLogger().info("Hi World");
		
	}
	@Override
	public void onDisable() {
		
	}
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if (cmd.getName().equalsIgnoreCase("ehlo") && sender instanceof Player){
			
			Player player = (Player) sender;
			
			player.sendMessage("HI, " + player.getName() + "!");
			
			return true;
			
		}
		
		return false;
	}

}
