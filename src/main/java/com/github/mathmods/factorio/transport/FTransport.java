package com.github.mathmods.factorio.transport;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(version="1.0.0",name="Factorio Transport", modid = "FactTransport")
public class FTransport {
	
	@Instance(value="FactTransport")
	public static FTransport instance;
	
	@SidedProxy(clientSide="com.github.mathmods.factorio.transport.client.ClientProxy",serverSide="com.github.mathmods.factorio.transport.ServerProxy")
	public static ServerProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event){
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
		
	}
	
}
