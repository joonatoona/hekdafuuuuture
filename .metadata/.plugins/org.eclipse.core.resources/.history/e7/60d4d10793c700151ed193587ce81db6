package cc.adida.FunPL;

import org.bukkit.Material;
import org.bukkit.entity.Player;

import com.rit.sucy.CustomEnchantment;

public class EnchantHeker extends CustomEnchantment {
	
	static final Material[] hexItems = new Material[] { Material.CHAINMAIL_BOOTS };
	
	public EnchantHeker() {
		super("Heker", hexItems, 2);
	}
	
	@Override
	public void applyEquipEffect(Player player, int enchantLvl) {
		player.setAllowFlight(true);
	}
	
	@Override
	public void applyUnequipEffect(Player player, int enchantLvl) {
		player.setAllowFlight(false);
	}
}
