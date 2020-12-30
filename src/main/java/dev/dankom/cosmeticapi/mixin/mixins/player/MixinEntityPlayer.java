package dev.dankom.cosmeticapi.mixin.mixins.player;

import com.mojang.authlib.GameProfile;
import net.minecraft.entity.player.EntityPlayer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(EntityPlayer.class)
public abstract class MixinEntityPlayer {
    @Shadow
    public abstract GameProfile getGameProfile();
}
