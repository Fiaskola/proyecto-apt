# Generated by Django 3.2.5 on 2021-07-01 22:22

from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ('adopciones', '0003_rename_estado_enadopcion_estado_id'),
    ]

    operations = [
        migrations.AddField(
            model_name='enadopcion',
            name='imagen',
            field=models.ImageField(null=True, upload_to='adopciones'),
        ),
    ]