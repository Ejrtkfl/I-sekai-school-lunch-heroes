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
            transform.position = new Vector3(0f,50f,0f);
        }
        if (Input.GetKey(KeyCode.Alpha2))
        {
            transform.position = new Vector3(0f,40f, 0f);
        }
        if (Input.GetKey(KeyCode.Alpha3))
        {
            transform.position = new Vector3(0f, 30f, 0f);
        }
        if (Input.GetKey(KeyCode.Alpha4))
        {
            transform.position = new Vector3(0f, 20f, 0f);
        }
        if (Input.GetKey(KeyCode.Alpha5))
        {
            transform.position = new Vector3(0f, 10f, 0f);
        }
    }
}
