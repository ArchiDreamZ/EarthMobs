package baguchan.earthmobsmod.client.model;

import baguchan.earthmobsmod.entity.WoolyCow;
import net.minecraft.client.model.CowModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;

public class WoolyCowModel<T extends WoolyCow> extends CowModel<T> {
	public WoolyCowModel(ModelPart modelPart) {
		super(modelPart);
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		int i = 12;
		partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -4.0F, -6.0F, 8.0F, 8.0F, 6.0F).texOffs(22, 0).addBox("right_horn", -5.0F, -5.0F, -4.0F, 1.0F, 3.0F, 1.0F).texOffs(22, 0).addBox("left_horn", 4.0F, -5.0F, -4.0F, 1.0F, 3.0F, 1.0F), PartPose.offset(0.0F, 4.0F, -8.0F));
		PartDefinition partdefinition2 = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(18, 4).addBox(-6.0F, -10.0F, -7.0F, 12.0F, 18.0F, 10.0F).texOffs(52, 0).addBox(-2.0F, 2.0F, -8.0F, 4.0F, 6.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 5.0F, 2.0F, ((float) Math.PI / 2F), 0.0F, 0.0F));
		PartDefinition partdefinition3 = partdefinition2.addOrReplaceChild("body_part", CubeListBuilder.create().texOffs(52, 6).addBox(-42.0F, -1.5F, 30.0F, 3F, 8.0F, 0.0F), PartPose.offsetAndRotation(-2.0F, 20.0F, -49.0F, ((float) Math.PI / 2F), ((float) Math.PI / 2F), 0.0F));
		partdefinition3.addOrReplaceChild("body_part2", CubeListBuilder.create().texOffs(52, 6).addBox(-1.5F, -4.0F, 0.0F, 3F, 8.0F, 0.0F), PartPose.offsetAndRotation(-41.0F, 2.5F, 12.0F, ((float) Math.PI), 0.0F, 0.0F));

		PartDefinition partdefinition4 = partdefinition2.addOrReplaceChild("body_part3", CubeListBuilder.create().texOffs(26, 0).addBox(1.0F, -0.01F, -2.0F, 16.0F, 0.0F, 3.0F), PartPose.offsetAndRotation(6.0F, -10.0F, -8.0F, 0.0F, 0.0F, ((float) Math.PI / 2F)));
		partdefinition4.addOrReplaceChild("body_part4", CubeListBuilder.create().texOffs(26, 0).addBox(-8.0F, 0.0F, -1.5F, 16.0F, 0.0F, 3.0F), PartPose.offsetAndRotation(9.0F, 12.01F, -0.5F, 0.0F, 0.0F, -((float) Math.PI)));


		CubeListBuilder cubelistbuilder = CubeListBuilder.create().texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F);
		partdefinition.addOrReplaceChild("right_hind_leg", cubelistbuilder, PartPose.offset(-4.0F, 12.0F, 7.0F));
		partdefinition.addOrReplaceChild("left_hind_leg", cubelistbuilder, PartPose.offset(4.0F, 12.0F, 7.0F));
		partdefinition.addOrReplaceChild("right_front_leg", cubelistbuilder, PartPose.offset(-4.0F, 12.0F, -6.0F));
		partdefinition.addOrReplaceChild("left_front_leg", cubelistbuilder, PartPose.offset(4.0F, 12.0F, -6.0F));
		return LayerDefinition.create(meshdefinition, 64, 32);
	}
}
