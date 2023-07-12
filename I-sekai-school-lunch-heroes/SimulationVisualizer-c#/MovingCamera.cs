using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class MovingCamera : MonoBehaviour
{
    // Start is called before the first frame update
    void Start()
    {
        
    }

    // Update is called once per frame
    void Update()
    {
        if (Input.GetKey(KeyCode.Alpha1))
        {
            transform.position = new Vector3(-14.7f,8.3f,-15.6f);
            transform.eulerAngles = new Vector3(11.73f,-310.032f,-2.283f);
        }
        if (Input.GetKey(KeyCode.Alpha2))
        {
            transform.position = new Vector3(-7.2f,30f, -13.4f);
            transform.eulerAngles = new Vector3(7.818f,-307.787f,-2.182f);
        }
        if (Input.GetKey(KeyCode.Alpha3))
        {
            transform.position = new Vector3(-1.7f, 45.9f, -11.8f);
            transform.eulerAngles = new Vector3(7.818f,-307.787f,-2.099f);
        }
        if (Input.GetKey(KeyCode.Alpha4))
        {
            transform.position = new Vector3(4.3f, 63.2f, -10.1f);
            transform.eulerAngles = new Vector3(8.017f,-300.593f,-1.107f);
        }
        if (Input.GetKey(KeyCode.Alpha5))
        {
            transform.position = new Vector3(15.8f, 84.9f, -5.6f);
            transform.eulerAngles = new Vector3(4.168f,-292f,-0.5f);
        }
    }
}
