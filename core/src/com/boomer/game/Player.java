package com.boomer.game;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
 
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.Json;
import com.badlogic.gdx.utils.Json.Serializable;
import com.badlogic.gdx.utils.JsonValue;
 
public class Player implements Serializable
{
        private static final long serialversionUID = 1L;
        Vector2 position;
        Texture texture;
        String textureLoc;
 
        public Player(Vector2 postion,String textureLoc)
        {
                this.position = position;
                this.texture = new Texture(Gdx.files.internal(textureLoc));
        }
 
        public void update()
        {
 
        }
 
        @SuppressWarnings("unused")
        private static byte[] serialize(Object obj) throws IOException
        {
                ByteArrayOutputStream b = new ByteArrayOutputStream();
                ObjectOutputStream o = new ObjectOutputStream(b);
                o.writeObject(obj);
                return b.toByteArray();
        }
 
        public static Object deserialize(byte[] bytes) throws IOException, ClassNotFoundException
        {
                ByteArrayInputStream b = new ByteArrayInputStream(bytes);
                ObjectInputStream o = new ObjectInputStream(b);
                return o.readObject();
        }
 
        public Vector2 getPosition()
        {
                return position;
        }
 
        public void setPosition(Vector2 position)
        {
                this.position = position;
        }
 
        public Texture getTexture()
        {
                return texture;
        }
 
        public void setTexture(Texture texture)
        {
                this.texture = texture;
        }
 
       
        /*
         * The following method needs to be implemented
         * because of Serializable otherwise it
         * gives an error unless you figure out
         * how to get rid of it.
         */
        @Override
        public void write(Json json) {
                // TODO Auto-generated method stub
               
        }
 
        @Override
        public void read(Json json, JsonValue jsonData) {
                // TODO Auto-generated method stub
               
        }
}
