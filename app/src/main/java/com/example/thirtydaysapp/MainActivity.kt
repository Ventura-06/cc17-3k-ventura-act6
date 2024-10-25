package com.example.thirtydaysapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        val itemList = listOf(
            ItemsViewModel("Day 1: Basic Shapes Practice","Start by drawing basic shapes (circles, squares, triangles) to understand proportions and dimensions. Use different brushes and opacity settings to explore how they affect the shapes.",R.drawable.one),
            ItemsViewModel("Day 2: Color Theory","Spend time researching color theory. Create a color wheel and practice mixing colors digitally. Experiment with complementary and analogous color schemes in a small composition.", R.drawable.two),
            ItemsViewModel("Day 3: Gesture Drawing","Do a series of quick gesture drawings to capture the essence of movement. Set a timer for 1-5 minutes per drawing, focusing on the flow and posture rather than details.",R.drawable.three),
            ItemsViewModel("Day 4: Textures Exploration","Choose different textures (wood, fabric, metal) and create small swatches. Experiment with brushes that mimic these textures, learning how to represent them in your digital art.", R.drawable.four),
            ItemsViewModel("Day 5: Study a Master","Pick a digital artist or traditional painter you admire. Analyze their work—study their color palette, composition, and brushwork. Try to replicate one of their pieces to learn their techniques.", R.drawable.five),
            ItemsViewModel("Day 6: Simple Character Design","Create a simple character using basic shapes. Focus on proportions and features. Experiment with different styles (cartoonish, realistic, abstract) to see what resonates with you.", R.drawable.six),
            ItemsViewModel("Day 7: Environment Sketching","Draw a simple environment scene, like a park or a room. Focus on perspective and composition. Use layers to add foreground, midground, and background elements.", R.drawable.seven),
            ItemsViewModel("Day 8: Light and Shadow Study","Choose a basic object (like a sphere or a cube) and practice shading it to create depth. Study how light interacts with different surfaces and practice highlighting and shadowing techniques.", R.drawable.eight),
            ItemsViewModel("Day 9: Digital Inking","Take a sketch you’ve created and refine it using digital inking techniques. Experiment with line weight and pressure sensitivity to create a clean, polished look.", R.drawable.nine),
            ItemsViewModel("Day 10: Create a Mini Illustration","Combine everything you've learned in the first nine days to create a small illustration. Incorporate basic shapes, color theory, textures, and character or environment design in a cohesive piece.", R.drawable.ten),
            ItemsViewModel("Day 11: Explore Different Brushes","Experiment with various digital brushes available in your drawing software. Create a simple piece using each brush type, such as soft, hard, textured, and specialty brushes, to see their effects on your art.", R.drawable.eleven),
            ItemsViewModel("Day 12: Anatomy Study","Focus on understanding human anatomy. Draw basic human figures using reference images. Pay attention to proportions, muscle structure, and how joints articulate.", R.drawable.twelve),
            ItemsViewModel("Day 13: Composition Techniques","Study composition techniques like the rule of thirds, leading lines, and framing. Create a simple sketch applying these principles to improve your artwork's overall balance and focus.", R.drawable.thirteen),
            ItemsViewModel("Day 14: Character Expressions","Create a series of character expressions (happy, sad, angry, surprised) to practice capturing emotions. Focus on facial features and body language to convey different feelings.", R.drawable.fourteen),
            ItemsViewModel("Day 15: Digital Collage","Experiment with creating a digital collage by combining various elements (drawn and/or photographic) into one piece. Play with layering, blending modes, and transparency to create depth.", R.drawable.fifteen),
            ItemsViewModel("Day 16: Refine Line Work","Choose a previous sketch and focus on refining your line work. Aim for clean, consistent lines, adjusting weight and style to enhance the overall quality of your drawing.", R.drawable.sixteen),
            ItemsViewModel("Day 17: Environmental Lighting","Draw a simple environment (like a room or outdoor scene) with different lighting conditions (sunset, midday, moonlight). Practice how lighting affects colors and shadows in your artwork.", R.drawable.seventeen),
            ItemsViewModel("Day 18: Create a Storyboard","Create a short storyboard for a narrative or concept. Focus on visual storytelling, using thumbnails to represent key scenes and practice transitions between frames.", R.drawable.eighteen),
            ItemsViewModel("Day 19: Color Mood Studies","Create small pieces that focus on conveying different moods through color. Use a limited palette to evoke feelings like calmness, excitement, or melancholy, and see how colors affect the overall tone.", R.drawable.nineteen),
            ItemsViewModel("Day 20: Experiment with Styles","Choose a few different art styles (e.g., anime, realism, abstract) and create small sketches in each style. This will help you explore various artistic expressions and find what you enjoy most.", R.drawable.twenty),
            ItemsViewModel("Day 21: Create a Character Sheet","Design a character sheet that showcases your character from multiple angles and with different outfits or poses. Include details like color swatches, expressions, and accessories to flesh out the character design.", R.drawable.twoone),
            ItemsViewModel("Day 22: Background Elements","Focus on creating background elements for a scene. Draw items like trees, buildings, or furniture that add context to your artwork, practicing scale and perspective to ensure they fit well with your main subjects.", R.drawable.twotwo),
            ItemsViewModel("Day 23: Illustration with Text","Create an illustration that incorporates typography. Experiment with how text can enhance your artwork, choosing fonts and colors that complement the overall theme and message.", R.drawable.twothree),
            ItemsViewModel("Day 24: Explore Digital Effects","Experiment with digital effects like glows, blurs, and overlays. Use them in a piece to add atmosphere and enhance certain elements, learning how these effects can change the mood of your artwork.", R.drawable.twofour),
            ItemsViewModel("Day 25: Create a Fan Art","Choose a character or scene from a favorite show, movie, or game and create fan art. This will help you practice your style while drawing something familiar and enjoyable.", R.drawable.twofive),
            ItemsViewModel("Day 26: Develop a Personal Style","Spend time analyzing your previous works to identify common themes or techniques. Create a new piece that incorporates your unique style, focusing on consistency in color, line work, and subject matter.", R.drawable.twosix),
            ItemsViewModel("Day 27: Practice with Perspective","Create a piece that emphasizes perspective, using one-point, two-point, or three-point perspective. This could be a street scene, interior, or any subject that allows you to practice depth and dimension.", R.drawable.twoseven),
            ItemsViewModel("Day 28: Self-Portrait Challenge","Draw a self-portrait in your style. This will not only challenge your observation skills but also help you explore how to represent yourself through your unique artistic lens.", R.drawable.twoeight),
            ItemsViewModel("Day 29: Create a Zine Page","Design a page for a digital zine, combining illustrations with text. Choose a theme or story and create a layout that integrates both visual and written elements cohesively.", R.drawable.twonine),
            ItemsViewModel("Day 30: Reflect and Review","Spend this day reflecting on your progress over the past month. Review your sketches, completed pieces, and notes. Identify areas for improvement and set new goals for your continued artistic journey.", R.drawable.thirty)

        )

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = DaysAdapter(itemList)

    }
}