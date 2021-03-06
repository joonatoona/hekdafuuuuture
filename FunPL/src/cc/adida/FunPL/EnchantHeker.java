package cc.adida.FunPL;

import org.bukkit.Material;
import org.bukkit.entity.Player;

import com.rit.sucy.CustomEnchantment;

public class EnchantHeker extends CustomEnchantment {
	
	static final Material[] hexItems = new Material[] {
		Material.LEATHER_BOOTS, Material.CHAINMAIL_BOOTS, Material.IRON_BOOTS, Material.DIAMOND_BOOTS};
	
	public EnchantHeker() {
		super("Heker", hexItems, 2);
	}
	
	@Override
	public void applyEquipEffect(Player player, int enchantLvl) {
		player.setAllowFlight(true);
		player.setFlySpeed((float) 0.6);
		player.setWalkSpeed((float) 0.6);
	}
	
	@Override
	public void applyUnequipEffect(Player player, int enchantLvl) {
		player.setAllowFlight(false);
		player.setFlySpeed((float) 0.2);
		player.setWalkSpeed((float) 0.2);
	}
}
