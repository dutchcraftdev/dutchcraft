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
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		bb_main.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.bb_main.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.bb_main.rotateAngleX = f4 / (180F / (float) Math.PI);
	}
}