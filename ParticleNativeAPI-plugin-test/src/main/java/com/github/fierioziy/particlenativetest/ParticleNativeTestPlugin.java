package com.github.xap3y.particlenativetest;

import com.github.xap3y.particlenativeapi.api.ParticleNativeAPI;
import com.github.xap3y.particlenativeapi.api.utils.ParticleException;
import com.github.xap3y.particlenativeapi.core.ParticleNativeCore;
import com.github.xap3y.particlenativetest.command.CommandPNAL;
import com.github.xap3y.particlenativetest.command.CommandPNAT;
import org.bukkit.plugin.java.JavaPlugin;

public class ParticleNativeTestPlugin extends JavaPlugin {

    private boolean isValid = false;

    private ParticleNativeAPI particleApi;

    @Override
    public void onLoad() {
        particleApi = null;
        isValid = false;

        try {
            particleApi = ParticleNativeCore.loadAPI(this);
            isValid = true;
        }
        catch (ParticleException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onEnable() {
        this.getCommand("pnat").setExecutor(new CommandPNAT(this));
        this.getCommand("pnal").setExecutor(new CommandPNAL(this));
        this.setEnabled(isValid);
    }

    @Override
    public void onDisable() {
        particleApi = null;
        isValid = false;
    }

    public ParticleNativeAPI getAPI() {
        if (particleApi == null) {
            throw new IllegalStateException("Error occurred while getting particle library.");
        }

        return particleApi;
    }

}
