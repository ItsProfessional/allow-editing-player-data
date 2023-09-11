package me.proferk.alloweditingplayerdata.mixin;

import net.minecraft.command.EntityDataObject;
import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(EntityDataObject.class)
public class EntityDataObjectMixin {

    @ModifyConstant(method = "setNbt", constant = @Constant(classValue = PlayerEntity.class))
    private boolean onInstanceOf(Object entity, Class clPlayerEntity)
    {
        return false;
    }

}