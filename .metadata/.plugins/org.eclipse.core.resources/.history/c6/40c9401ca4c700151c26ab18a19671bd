package cc.adida.FunPL;

import java.util.Random;

import org.bukkit.Material;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import com.rit.sucy.CustomEnchantment;

public class EnchantTrap extends CustomEnchantment {
	static final Material[] Trap_Items = new Material[] {
		Material.WOOD_SWORD, Material.STONE_SWORD, Material.IRON_SWORD, Material.GOLD_SWORD, Material.DIAMOND_SWORD };

	public EnchantTrap() {
		super("Trap", Trap_Items, 2);
		this.max = 5;
	}
	
	@Override
    public void applyEffect(LivingEntity user, LivingEntity target, int enchantLevel, EntityDamageByEntityEvent event) {
		Random rand = new Random();
	    if (rand.nextInt((25 - enchantLevel) + 1) + enchantLevel == 1) {
	    	target.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, enchantLevel*20, 255));
	    	target.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, enchantLevel*20, 255));
	    }
	}
}
