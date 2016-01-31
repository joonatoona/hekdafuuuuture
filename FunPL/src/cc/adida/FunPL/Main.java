package cc.adida.FunPL;

import com.rit.sucy.EnchantPlugin;
import com.rit.sucy.EnchantmentAPI;

public class Main extends EnchantPlugin {
	@Override
	public void onEnable() {
		getLogger().info("Hi World");
		
	}
	@Override
	public void onDisable() {
		
	}
	@Override
    public void registerEnchantments() {
        EnchantmentAPI.registerCustomEnchantment(new EnchantHeker());
        EnchantmentAPI.registerCustomEnchantment(new EnchantThor());
        EnchantmentAPI.registerCustomEnchantment(new EnchantJohnCena());
        EnchantmentAPI.registerCustomEnchantment(new EnchantTrap());
        EnchantmentAPI.registerCustomEnchantment(new EnchantExplodabow());
    }

}
