
package net.dutch.dutchcraft.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import net.dutch.dutchcraft.entity.OrangeManEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class OrangeManRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(OrangeManEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelorange_man(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("dutchcraft:textures/entities/orange_man.png");
					}
				};
			});
		}
	}

	public static class Modelorange_man extends EntityModel<Entity> {
		private final ModelRenderer bb_main;

		public Modelorange_man() {
			textureWidth = 64;
			textureHeight = 64;
			bb_main = new ModelRenderer(this);
			bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
			bb_main.setTextureOffset(0, 0).addBox(-4.0F, -26.0F, -4.0F, 8.0F, 6.0F, 8.0F, 0.0F, false);
			bb_main.setTextureOffset(32, 0).addBox(-4.0F, -32.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.5F, false);
			bb_main.setTextureOffset(0, 14).addBox(-4.0F, -20.0F, -3.0F, 8.0F, 8.0F, 6.0F, 0.0F, false);
			bb_main.setTextureOffset(16, 32).addBox(-4.0F, -24.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.25F, false);
			bb_main.setTextureOffset(28, 14).addBox(-6.0F, -20.0F, -2.0F, 2.0F, 12.0F, 2.0F, 0.0F, false);
			bb_main.setTextureOffset(31, 36).addBox(-8.0F, -24.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, false);
			bb_main.setTextureOffset(28, 14).addBox(4.0F, -20.0F, -1.0F, 2.0F, 12.0F, 2.0F, 0.0F, false);
			bb_main.setTextureOffset(48, 48).addBox(4.0F, -24.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, false);
			bb_main.setTextureOffset(44, 18).addBox(-3.9F, -12.0F, -1.0F, 4.0F, 12.0F, 2.0F, 0.0F, false);
			bb_main.setTextureOffset(0, 32).addBox(-3.9F, -12.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, false);
			bb_main.setTextureOffset(44, 18).addBox(-0.1F, -12.0F, -1.0F, 4.0F, 12.0F, 2.0F, 0.0F, false);
			bb_main.setTextureOffset(0, 48).addBox(-0.1F, -12.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, false);
		}

		@Override
		public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			// previously the render function, render code was moved to a method below
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			bb_main.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}
	}

}
