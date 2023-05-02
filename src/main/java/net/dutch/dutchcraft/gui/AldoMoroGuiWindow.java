
package net.dutch.dutchcraft.gui;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.client.Minecraft;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class AldoMoroGuiWindow extends ContainerScreen<AldoMoroGui.GuiContainerMod> {
	private World world;
	private int x, y, z;
	private PlayerEntity entity;
	private final static HashMap guistate = AldoMoroGui.guistate;

	public AldoMoroGuiWindow(AldoMoroGui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 376;
		this.ySize = 200;
	}

	private static final ResourceLocation texture = new ResourceLocation("dutchcraft:textures/screens/aldo_moro.png");

	@Override
	public void render(MatrixStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderHoveredTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(MatrixStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.color4f(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		Minecraft.getInstance().getTextureManager().bindTexture(texture);
		int k = (this.width - this.xSize) / 2;
		int l = (this.height - this.ySize) / 2;
		this.blit(ms, k, l, 0, 0, this.xSize, this.ySize, this.xSize, this.ySize);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("dutchcraft:textures/screens/bandwidth.png"));
		this.blit(ms, this.guiLeft + 7, this.guiTop + 6, 0, 0, 64, 64, 64, 64);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeScreen();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void tick() {
		super.tick();
	}

	@Override
	protected void drawGuiContainerForegroundLayer(MatrixStack ms, int mouseX, int mouseY) {
		this.font.drawString(ms, "On 16 March, 1978, former Italian prime minister, ", 79, 6, -12829636);
		this.font.drawString(ms, "Aldo Moro, was kidnapped by several members of ", 79, 15, -12829636);
		this.font.drawString(ms, "the Brigate Rosse (the Red Brigades) in Rome, ", 79, 24, -12829636);
		this.font.drawString(ms, "a militant communist organization. During this ", 79, 33, -12829636);
		this.font.drawString(ms, "time, he was submitted to a \"people's trial\" ", 79, 42, -12829636);
		this.font.drawString(ms, "and sent a variety of letters to his family and ", 79, 51, -12829636);
		this.font.drawString(ms, "associates. Negotiations occured during his ", 79, 60, -12829636);
		this.font.drawString(ms, "captivity, although these failed. 54 days later, ", 79, 69, -12829636);
		this.font.drawString(ms, "he was found dead in a car sat in between the ", 7, 78, -12829636);
		this.font.drawString(ms, "headquarters of the Christian Democratic Party ", 7, 87, -12829636);
		this.font.drawString(ms, "and the Italian Communist Party. ", 7, 96, -12829636);
		this.font.drawString(ms, "A variety of theories surround his killing. ", 7, 105, -12829636);
		this.font.drawString(ms, "During this time, a stay-behind organization set up by the ", 7, 114, -12829636);
		this.font.drawString(ms, "United States known as \"Operation Gladio\" was active in ", 7, 123, -12829636);
		this.font.drawString(ms, "Italy. It employed a \"strategy of tension\" in order to ", 7, 132, -12829636);
		this.font.drawString(ms, "maintain control over Western Europe. This is related ", 7, 141, -12829636);
		this.font.drawString(ms, "to the theory that the assassination was staged by the ", 7, 150, -12829636);
		this.font.drawString(ms, "United States in order to end the \"Historic Compromise\" ", 7, 159, -12829636);
		this.font.drawString(ms, "between the Christian Democratic party and the Italian ", 7, 168, -12829636);
		this.font.drawString(ms, "Communist Party, preventing a communist party from gaining ", 7, 177, -12829636);
		this.font.drawString(ms, "control in Italy.", 7, 186, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardListener.enableRepeatEvents(false);
	}

	@Override
	public void init(Minecraft minecraft, int width, int height) {
		super.init(minecraft, width, height);
		minecraft.keyboardListener.enableRepeatEvents(true);
	}
}
