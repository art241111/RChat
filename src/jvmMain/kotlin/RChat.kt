import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import robot.RobotsContext

@Composable
fun RChat(robotsContext: RobotsContext) {
    Text("RChat: robots number = ${robotsContext.getRobotsName().value.size}")
}