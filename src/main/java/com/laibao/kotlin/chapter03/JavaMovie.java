package com.laibao.kotlin.chapter03;

/**
 * @author jinge
 * Created by jinge on 2017/11/4.
 */
public class JavaMovie {
    private String name;
    private String studio;
    private float rating;

    public JavaMovie(String name, String studio, float rating) {
        this.name = name;
        this.studio = studio;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + Float.floatToIntBits(rating);
        result = prime * result + ((studio == null) ? 0 : studio.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }

        JavaMovie other = (JavaMovie) obj;
        if (name == null) {
            if (other.name != null) {
                return false;
            }
        } else if (!name.equals(other.name)) {
            return false;
        }
        if (Float.floatToIntBits(rating) != Float.floatToIntBits(other.rating)) {
            return false;
        }
        if (studio == null) {
            if (other.studio != null) {
                return false;
            }
        } else if (!studio.equals(other.studio)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "JavaMovie [name=" + name + ", studio=" + studio + ", rating=" + rating + "]";
    }
}
