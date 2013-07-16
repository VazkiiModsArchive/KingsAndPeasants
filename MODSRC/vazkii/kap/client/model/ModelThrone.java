package vazkii.kap.client.model;

import java.awt.Color;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import vazkii.kap.client.util.helper.RenderHelper;
import vazkii.kap.core.lib.LibResources;
import vazkii.kap.util.storage.CrestData;

public class ModelThrone extends ModelBase {

	ModelRenderer Leg1;
	ModelRenderer Leg2;
	ModelRenderer Leg3;
	ModelRenderer Leg4;
	ModelRenderer Seat;
	ModelRenderer Bar1;
	ModelRenderer Bar2;
	ModelRenderer Bar3;
	ModelRenderer Bar4;
	ModelRenderer SeatBar1;
	ModelRenderer SeatBar2;
	ModelRenderer SeatBar3;
	ModelRenderer Cushion1;
	ModelRenderer Cushion2;
	ModelRenderer Back1;
	ModelRenderer Back2;
	ModelRenderer Back3;
	ModelRenderer Back4;
	ModelRenderer Back5;
	ModelRenderer ArmBar1;
	ModelRenderer ArmBar2;
	ModelRenderer ArmBar3;
	ModelRenderer ArmBar4;
	ModelRenderer ArmBar5;
	ModelRenderer ArmBar6;
	ModelRenderer ArmBar7;
	ModelRenderer ArmBar8;

	public ModelThrone() {
		textureWidth = 128;
		textureHeight = 64;

		Leg1 = new ModelRenderer(this, 0, 0);
		Leg1.addBox(0F, 0F, 0F, 2, 9, 2);
		Leg1.setRotationPoint(4F, 15F, -6F);
		Leg1.setTextureSize(128, 64);
		Leg2 = new ModelRenderer(this, 0, 0);
		Leg2.addBox(0F, 0F, 0F, 2, 9, 2);
		Leg2.setRotationPoint(-6F, 15F, -6F);
		Leg2.setTextureSize(128, 64);
		Leg3 = new ModelRenderer(this, 0, 0);
		Leg3.addBox(0F, 0F, 0F, 2, 9, 2);
		Leg3.setRotationPoint(4F, 15F, 4F);
		Leg3.setTextureSize(128, 64);
		Leg4 = new ModelRenderer(this, 0, 0);
		Leg4.addBox(0F, 0F, 0F, 2, 9, 2);
		Leg4.setRotationPoint(-6F, 15F, 4F);
		Leg4.setTextureSize(128, 64);
		Seat = new ModelRenderer(this, 38, 0);
		Seat.addBox(0F, 0F, 0F, 12, 1, 12);
		Seat.setRotationPoint(-6F, 14F, -6F);
		Seat.setTextureSize(128, 64);
		Bar1 = new ModelRenderer(this, 47, 17);
		Bar1.addBox(0F, 0F, 0F, 1, 3, 8);
		Bar1.setRotationPoint(-6F, 17F, -4F);
		Bar1.setTextureSize(128, 64);
		Bar2 = new ModelRenderer(this, 29, 17);
		Bar2.addBox(0F, 0F, 0F, 1, 3, 8);
		Bar2.setRotationPoint(5F, 17F, -4F);
		Bar2.setTextureSize(128, 64);
		Bar3 = new ModelRenderer(this, 29, 28);
		Bar3.addBox(0F, 0F, 0F, 8, 2, 1);
		Bar3.setRotationPoint(-4F, 17F, -6F);
		Bar3.setTextureSize(128, 64);
		Bar4 = new ModelRenderer(this, 0, 0);
		Bar4.addBox(0F, 0F, 0F, 8, 2, 1);
		Bar4.setRotationPoint(-4F, 17F, 5F);
		Bar4.setTextureSize(128, 64);
		SeatBar1 = new ModelRenderer(this, 0, 37);
		SeatBar1.addBox(0F, 0F, 0F, 12, 1, 1);
		SeatBar1.setRotationPoint(-6F, 13F, -6F);
		SeatBar1.setTextureSize(128, 64);
		SeatBar2 = new ModelRenderer(this, 0, 39);
		SeatBar2.addBox(0F, 0F, 0F, 12, 1, 1);
		SeatBar2.setRotationPoint(-6F, 13F, 5F);
		SeatBar2.setTextureSize(128, 64);
		SeatBar3 = new ModelRenderer(this, 0, 41);
		SeatBar3.addBox(0F, 0F, 0F, 1, 1, 10);
		SeatBar3.setRotationPoint(-6F, 13F, -5F);
		SeatBar3.setTextureSize(128, 64);
		Cushion1 = new ModelRenderer(this, 86, 0);
		Cushion1.addBox(0F, 0F, -5F, 11, 1, 10);
		Cushion1.setRotationPoint(-5F, 13F, 0F);
		Cushion1.setTextureSize(128, 64);
		Cushion2 = new ModelRenderer(this, 110, 11);
		Cushion2.addBox(0F, 0F, 0F, 1, 17, 8);
		Cushion2.setRotationPoint(-7F, -6F, -4F);
		Cushion2.setTextureSize(128, 64);
		Back1 = new ModelRenderer(this, 76, 32);
		Back1.addBox(0F, 0F, 0F, 1, 20, 12);
		Back1.setRotationPoint(-8F, -6F, -6F);
		Back1.setTextureSize(128, 64);
		Back2 = new ModelRenderer(this, 50, 48);
		Back2.addBox(0F, 0F, 0F, 1, 4, 12);
		Back2.setRotationPoint(-7F, 11F, -6F);
		Back2.setTextureSize(128, 64);
		Back3 = new ModelRenderer(this, 103, 45);
		Back3.addBox(0F, 0F, 0F, 1, 17, 2);
		Back3.setRotationPoint(-7F, -6F, -6F);
		Back3.setTextureSize(128, 64);
		Back4 = new ModelRenderer(this, 109, 45);
		Back4.addBox(0F, 0F, 0F, 1, 17, 2);
		Back4.setRotationPoint(-7F, -6F, 4F);
		Back4.setTextureSize(128, 64);
		Back5 = new ModelRenderer(this, 51, 34);
		Back5.addBox(0F, 0F, 0F, 2, 3, 10);
		Back5.setRotationPoint(-8F, -9F, -5F);
		Back5.setTextureSize(128, 64);
		ArmBar1 = new ModelRenderer(this, 25, 0);
		ArmBar1.addBox(0F, 0F, 0F, 1, 4, 1);
		ArmBar1.setRotationPoint(5F, 9F, 5F);
		ArmBar1.setTextureSize(128, 64);
		ArmBar2 = new ModelRenderer(this, 30, 0);
		ArmBar2.addBox(0F, 0F, 0F, 1, 4, 1);
		ArmBar2.setRotationPoint(5F, 9F, -6F);
		ArmBar2.setTextureSize(128, 64);
		ArmBar3 = new ModelRenderer(this, 21, 6);
		ArmBar3.addBox(0F, 0F, 0F, 6, 1, 1);
		ArmBar3.setRotationPoint(-1F, 8F, -6F);
		ArmBar3.setTextureSize(128, 64);
		ArmBar3.mirror = true;
		ArmBar4 = new ModelRenderer(this, 21, 8);
		ArmBar4.addBox(0F, 0F, 0F, 6, 1, 1);
		ArmBar4.setRotationPoint(-1F, 8F, 5F);
		ArmBar4.setTextureSize(128, 64);
		ArmBar5 = new ModelRenderer(this, 22, 10);
		ArmBar5.addBox(0F, 0F, 0F, 5, 1, 1);
		ArmBar5.setRotationPoint(-6F, 7F, -6F);
		ArmBar5.setTextureSize(128, 64);
		ArmBar6 = new ModelRenderer(this, 22, 12);
		ArmBar6.addBox(0F, 0F, 0F, 5, 1, 1);
		ArmBar6.setRotationPoint(-6F, 7F, 5F);
		ArmBar6.setTextureSize(128, 64);
		ArmBar7 = new ModelRenderer(this, 15, 9);
		ArmBar7.addBox(0F, 0F, 0F, 1, 5, 1);
		ArmBar7.setRotationPoint(-6F, 8F, -6F);
		ArmBar7.setTextureSize(128, 64);
		ArmBar8 = new ModelRenderer(this, 11, 9);
		ArmBar8.addBox(0F, 0F, 0F, 1, 5, 1);
		ArmBar8.setRotationPoint(-6F, 8F, 5F);
		ArmBar8.setTextureSize(128, 64);
	}

	public void render(CrestData crest) {
		Minecraft.getMinecraft().renderEngine.func_110577_a(new ResourceLocation(LibResources.MODEL_THRONE));

		Leg1.render(0.0625F);
		Leg2.render(0.0625F);
		Leg3.render(0.0625F);
		Leg4.render(0.0625F);
		Seat.render(0.0625F);
		Bar1.render(0.0625F);
		Bar2.render(0.0625F);
		Bar3.render(0.0625F);
		Bar4.render(0.0625F);
		SeatBar1.render(0.0625F);
		SeatBar2.render(0.0625F);
		SeatBar3.render(0.0625F);
		Back1.render(0.0625F);
		Back2.render(0.0625F);
		Back3.render(0.0625F);
		Back4.render(0.0625F);
		Back5.render(0.0625F);
		ArmBar1.render(0.0625F);
		ArmBar2.render(0.0625F);
		ArmBar3.render(0.0625F);
		ArmBar4.render(0.0625F);
		ArmBar5.render(0.0625F);
		ArmBar6.render(0.0625F);
		ArmBar7.render(0.0625F);
		ArmBar8.render(0.0625F);

		boolean crestExists = crest != null && crest.icon != -1;

		if(crestExists) {
			GL11.glPushMatrix();
			float scale = 155F;
			float dimScale = 1F / scale;
			GL11.glRotatef(90F, 0F, 1F, 0F);
			GL11.glRotatef(180F, 0F, 1F, 0F);
			GL11.glTranslatef(-0.21F, -0.1F, 0.362F);
			GL11.glScalef(dimScale, dimScale, dimScale);
			RenderHelper.renderCrest(crest, 0, 2, 0, false);
			Color color = new Color(crest.color1);
			GL11.glColor3f(color.getRed() / 255F, color.getGreen() / 255F, color.getBlue() / 255F);
			GL11.glPopMatrix();
			Minecraft.getMinecraft().renderEngine.func_110577_a(new ResourceLocation(LibResources.MODEL_THRONE));
		}

		Cushion1.render(0.0625F);
		Cushion2.render(0.0625F);
	}
}